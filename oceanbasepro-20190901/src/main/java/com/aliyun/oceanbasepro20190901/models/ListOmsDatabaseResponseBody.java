// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsDatabaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOmsDatabaseResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsDatabaseResponseBody self = new ListOmsDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsDatabaseResponseBody setData(java.util.List<ListOmsDatabaseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOmsDatabaseResponseBodyData> getData() {
        return this.data;
    }

    public ListOmsDatabaseResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsDatabaseResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOmsDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsDatabaseResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsDatabaseResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListOmsDatabaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsDatabaseResponseBodyData self = new ListOmsDatabaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsDatabaseResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOmsDatabaseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
