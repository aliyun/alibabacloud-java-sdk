// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmsResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public ListAlgorithmsResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ListAlgorithmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmsResponseBody self = new ListAlgorithmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmsResponseBody setData(ListAlgorithmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAlgorithmsResponseBodyData getData() {
        return this.data;
    }

    public ListAlgorithmsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListAlgorithmsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAlgorithmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAlgorithmsResponseBodyDataAlgorithms extends TeaModel {
        // 算法Id。
        @NameInMap("Id")
        public String id;

        // 算法名称。
        @NameInMap("Name")
        public String name;

        public static ListAlgorithmsResponseBodyDataAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            ListAlgorithmsResponseBodyDataAlgorithms self = new ListAlgorithmsResponseBodyDataAlgorithms();
            return TeaModel.build(map, self);
        }

        public ListAlgorithmsResponseBodyDataAlgorithms setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlgorithmsResponseBodyDataAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAlgorithmsResponseBodyData extends TeaModel {
        // 算法列表。
        @NameInMap("Algorithms")
        public java.util.List<ListAlgorithmsResponseBodyDataAlgorithms> algorithms;

        // 分页数，从1开始，默认为1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10。
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总算法数量。
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAlgorithmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlgorithmsResponseBodyData self = new ListAlgorithmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlgorithmsResponseBodyData setAlgorithms(java.util.List<ListAlgorithmsResponseBodyDataAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<ListAlgorithmsResponseBodyDataAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public ListAlgorithmsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAlgorithmsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAlgorithmsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
