// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListDatasetDatasResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDatasetDatasResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDatasetDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetDatasResponseBody self = new ListDatasetDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetDatasResponseBody setData(ListDatasetDatasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDatasetDatasResponseBodyData getData() {
        return this.data;
    }

    public ListDatasetDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDatasetDatasResponseBodyData extends TeaModel {
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

        public static ListDatasetDatasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetDatasResponseBodyData self = new ListDatasetDatasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDatasetDatasResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListDatasetDatasResponseBodyData setElements(java.util.List<java.util.Map<String, ?>> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElements() {
            return this.elements;
        }

        public ListDatasetDatasResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDatasetDatasResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListDatasetDatasResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
