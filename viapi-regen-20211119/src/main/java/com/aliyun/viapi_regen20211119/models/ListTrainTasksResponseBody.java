// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListTrainTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListTrainTasksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTrainTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainTasksResponseBody self = new ListTrainTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainTasksResponseBody setData(ListTrainTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTrainTasksResponseBodyData getData() {
        return this.data;
    }

    public ListTrainTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTrainTasksResponseBodyData extends TeaModel {
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

        public static ListTrainTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTrainTasksResponseBodyData self = new ListTrainTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTrainTasksResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListTrainTasksResponseBodyData setElements(java.util.List<java.util.Map<String, ?>> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElements() {
            return this.elements;
        }

        public ListTrainTasksResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTrainTasksResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListTrainTasksResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
