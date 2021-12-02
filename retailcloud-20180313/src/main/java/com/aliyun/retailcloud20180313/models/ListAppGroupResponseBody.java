// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListAppGroupResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupResponseBody self = new ListAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppGroupResponseBody setData(java.util.List<ListAppGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListAppGroupResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListAppGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppGroupResponseBodyData extends TeaModel {
        @NameInMap("BizName")
        public String bizName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListAppGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupResponseBodyData self = new ListAppGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppGroupResponseBodyData setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public ListAppGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
