// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeDisksResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("data")
    public Data data;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    // success
    @NameInMap("success")
    public Boolean success;

    public static ListNodeDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDisksResponseBody self = new ListNodeDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeDisksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNodeDisksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNodeDisksResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListNodeDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeDisksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        // items
        @NameInMap("items")
        public java.util.List<ClusterDisk> items;

        // pageNumber
        @NameInMap("pageNumber")
        public Integer pageNumber;

        // pageSize
        @NameInMap("pageSize")
        public Integer pageSize;

        // totalCount
        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<ClusterDisk> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ClusterDisk> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
