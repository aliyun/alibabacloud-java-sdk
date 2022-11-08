// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListDataReflowDatasResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDataReflowDatasResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDataReflowDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataReflowDatasResponseBody self = new ListDataReflowDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataReflowDatasResponseBody setData(ListDataReflowDatasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataReflowDatasResponseBodyData getData() {
        return this.data;
    }

    public ListDataReflowDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataReflowDatasResponseBodyData extends TeaModel {
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

        public static ListDataReflowDatasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataReflowDatasResponseBodyData self = new ListDataReflowDatasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataReflowDatasResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListDataReflowDatasResponseBodyData setElements(java.util.List<java.util.Map<String, ?>> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElements() {
            return this.elements;
        }

        public ListDataReflowDatasResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataReflowDatasResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListDataReflowDatasResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
