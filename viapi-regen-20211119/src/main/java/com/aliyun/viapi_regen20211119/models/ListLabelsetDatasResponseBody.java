// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListLabelsetDatasResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListLabelsetDatasResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLabelsetDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLabelsetDatasResponseBody self = new ListLabelsetDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLabelsetDatasResponseBody setData(ListLabelsetDatasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLabelsetDatasResponseBodyData getData() {
        return this.data;
    }

    public ListLabelsetDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLabelsetDatasResponseBodyData extends TeaModel {
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

        public static ListLabelsetDatasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLabelsetDatasResponseBodyData self = new ListLabelsetDatasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLabelsetDatasResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListLabelsetDatasResponseBodyData setElements(java.util.List<java.util.Map<String, ?>> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElements() {
            return this.elements;
        }

        public ListLabelsetDatasResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListLabelsetDatasResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListLabelsetDatasResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
