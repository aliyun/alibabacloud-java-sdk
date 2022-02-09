// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsTableResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOmsTableResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsTableResponseBody self = new ListOmsTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsTableResponseBody setData(java.util.List<ListOmsTableResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOmsTableResponseBodyData> getData() {
        return this.data;
    }

    public ListOmsTableResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsTableResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOmsTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsTableResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsTableResponseBodyData extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListOmsTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsTableResponseBodyData self = new ListOmsTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsTableResponseBodyData setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListOmsTableResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListOmsTableResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOmsTableResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
