// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListResponseBody extends TeaModel {
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
    public DescribeCrossBackupMetaListResponseBodyItems items;

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

    public DescribeCrossBackupMetaListResponseBody setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
        return this;
    }
    public Integer getTotalPageCount() {
        return this.totalPageCount;
    }

    public DescribeCrossBackupMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossBackupMetaListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossBackupMetaListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeCrossBackupMetaListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossBackupMetaListResponseBody setItems(DescribeCrossBackupMetaListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossBackupMetaListResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeCrossBackupMetaListResponseBodyItemsMeta extends TeaModel {
        @NameInMap("Tables")
        public String tables;

        @NameInMap("Database")
        public String database;

        @NameInMap("Size")
        public String size;

        public static DescribeCrossBackupMetaListResponseBodyItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossBackupMetaListResponseBodyItemsMeta self = new DescribeCrossBackupMetaListResponseBodyItemsMeta();
            return TeaModel.build(map, self);
        }

        public DescribeCrossBackupMetaListResponseBodyItemsMeta setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
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
