// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("TotalPageCount")
    @Validation(required = true)
    public Integer totalPageCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeCrossBackupMetaListResponseItems items;

    public static DescribeCrossBackupMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossBackupMetaListResponse self = new DescribeCrossBackupMetaListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossBackupMetaListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossBackupMetaListResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeCrossBackupMetaListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossBackupMetaListResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossBackupMetaListResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeCrossBackupMetaListResponse setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
        return this;
    }
    public Integer getTotalPageCount() {
        return this.totalPageCount;
    }

    public DescribeCrossBackupMetaListResponse setItems(DescribeCrossBackupMetaListResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossBackupMetaListResponseItems getItems() {
        return this.items;
    }

    public static class DescribeCrossBackupMetaListResponseItemsMeta extends TeaModel {
        @NameInMap("Database")
        @Validation(required = true)
        public String database;

        @NameInMap("Tables")
        @Validation(required = true)
        public String tables;

        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        public static DescribeCrossBackupMetaListResponseItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossBackupMetaListResponseItemsMeta self = new DescribeCrossBackupMetaListResponseItemsMeta();
            return TeaModel.build(map, self);
        }

        public DescribeCrossBackupMetaListResponseItemsMeta setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeCrossBackupMetaListResponseItemsMeta setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
        }

        public DescribeCrossBackupMetaListResponseItemsMeta setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class DescribeCrossBackupMetaListResponseItems extends TeaModel {
        @NameInMap("Meta")
        @Validation(required = true)
        public java.util.List<DescribeCrossBackupMetaListResponseItemsMeta> meta;

        public static DescribeCrossBackupMetaListResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossBackupMetaListResponseItems self = new DescribeCrossBackupMetaListResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeCrossBackupMetaListResponseItems setMeta(java.util.List<DescribeCrossBackupMetaListResponseItemsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<DescribeCrossBackupMetaListResponseItemsMeta> getMeta() {
            return this.meta;
        }

    }

}
