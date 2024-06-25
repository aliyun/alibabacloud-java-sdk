// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeMetaListResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1s826a1up******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The details of databases and tables that can be restored.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMetaListResponseBodyItems> items;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AA815DE7-B576-4B22-B33C-3FB31A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageCount")
    public String totalPageCount;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaListResponseBody self = new DescribeMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetaListResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeMetaListResponseBody setItems(java.util.List<DescribeMetaListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeMetaListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeMetaListResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
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

    public static class DescribeMetaListResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the database that can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The name of the table that can be restored.</p>
         */
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
