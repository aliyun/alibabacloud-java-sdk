// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListServicesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setData(ListServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListServicesResponseBodyData getData() {
        return this.data;
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListServicesResponseBodyData extends TeaModel {
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

        public static ListServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyData self = new ListServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListServicesResponseBodyData setElements(java.util.List<java.util.Map<String, ?>> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElements() {
            return this.elements;
        }

        public ListServicesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListServicesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListServicesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
