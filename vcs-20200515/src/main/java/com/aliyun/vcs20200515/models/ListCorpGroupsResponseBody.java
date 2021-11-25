// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCorpGroupsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCorpGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCorpGroupsResponseBody self = new ListCorpGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCorpGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpGroupsResponseBody setData(ListCorpGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCorpGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListCorpGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCorpGroupsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<String> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static ListCorpGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpGroupsResponseBodyData self = new ListCorpGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCorpGroupsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCorpGroupsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCorpGroupsResponseBodyData setRecords(java.util.List<String> records) {
            this.records = records;
            return this;
        }
        public java.util.List<String> getRecords() {
            return this.records;
        }

        public ListCorpGroupsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListCorpGroupsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
