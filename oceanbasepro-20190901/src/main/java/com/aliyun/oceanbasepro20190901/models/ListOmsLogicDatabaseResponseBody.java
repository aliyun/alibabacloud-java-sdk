// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsLogicDatabaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOmsLogicDatabaseResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsLogicDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsLogicDatabaseResponseBody self = new ListOmsLogicDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsLogicDatabaseResponseBody setData(java.util.List<ListOmsLogicDatabaseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOmsLogicDatabaseResponseBodyData> getData() {
        return this.data;
    }

    public ListOmsLogicDatabaseResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsLogicDatabaseResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOmsLogicDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsLogicDatabaseResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsLogicDatabaseResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListOmsLogicDatabaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsLogicDatabaseResponseBodyData self = new ListOmsLogicDatabaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsLogicDatabaseResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOmsLogicDatabaseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
