// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsLogicTableResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOmsLogicTableResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsLogicTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsLogicTableResponseBody self = new ListOmsLogicTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsLogicTableResponseBody setData(java.util.List<ListOmsLogicTableResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOmsLogicTableResponseBodyData> getData() {
        return this.data;
    }

    public ListOmsLogicTableResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsLogicTableResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOmsLogicTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsLogicTableResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsLogicTableResponseBodyData extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListOmsLogicTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsLogicTableResponseBodyData self = new ListOmsLogicTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsLogicTableResponseBodyData setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListOmsLogicTableResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListOmsLogicTableResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOmsLogicTableResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
