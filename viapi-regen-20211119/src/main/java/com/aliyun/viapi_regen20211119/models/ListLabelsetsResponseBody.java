// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListLabelsetsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListLabelsetsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLabelsetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLabelsetsResponseBody self = new ListLabelsetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLabelsetsResponseBody setData(ListLabelsetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLabelsetsResponseBodyData getData() {
        return this.data;
    }

    public ListLabelsetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLabelsetsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Elements")
        public java.util.List<java.util.Map<String, ?>> elements;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static ListLabelsetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLabelsetsResponseBodyData self = new ListLabelsetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLabelsetsResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListLabelsetsResponseBodyData setElements(java.util.List<java.util.Map<String, ?>> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElements() {
            return this.elements;
        }

        public ListLabelsetsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListLabelsetsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListLabelsetsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
