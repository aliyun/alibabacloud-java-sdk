// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpGroupsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListCorpGroupsResponseData data;

    public static ListCorpGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpGroupsResponse self = new ListCorpGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpGroupsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpGroupsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpGroupsResponse setData(ListCorpGroupsResponseData data) {
        this.data = data;
        return this;
    }
    public ListCorpGroupsResponseData getData() {
        return this.data;
    }

    public static class ListCorpGroupsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Long totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<String> records;

        public static ListCorpGroupsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpGroupsResponseData self = new ListCorpGroupsResponseData();
            return TeaModel.build(map, self);
        }

        public ListCorpGroupsResponseData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCorpGroupsResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCorpGroupsResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListCorpGroupsResponseData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListCorpGroupsResponseData setRecords(java.util.List<String> records) {
            this.records = records;
            return this;
        }
        public java.util.List<String> getRecords() {
            return this.records;
        }

    }

}
