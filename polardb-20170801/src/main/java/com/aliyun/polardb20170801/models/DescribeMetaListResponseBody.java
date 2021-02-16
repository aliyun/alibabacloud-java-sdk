// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeMetaListResponseBody extends TeaModel {
    @NameInMap("TotalPageCount")
    public String totalPageCount;

    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("Items")
    public java.util.List<DescribeMetaListResponseBodyItems> items;

    public static DescribeMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaListResponseBody self = new DescribeMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetaListResponseBody setTotalPageCount(String totalPageCount) {
        this.totalPageCount = totalPageCount;
        return this;
    }
    public String getTotalPageCount() {
        return this.totalPageCount;
    }

    public DescribeMetaListResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeMetaListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetaListResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetaListResponseBody setItems(java.util.List<DescribeMetaListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeMetaListResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeMetaListResponseBodyItems extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static DescribeMetaListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaListResponseBodyItems self = new DescribeMetaListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMetaListResponseBodyItems setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeMetaListResponseBodyItems setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

}
