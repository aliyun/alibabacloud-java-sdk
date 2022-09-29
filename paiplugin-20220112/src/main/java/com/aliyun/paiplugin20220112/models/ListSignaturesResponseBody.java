// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListSignaturesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListSignaturesResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSignaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSignaturesResponseBody self = new ListSignaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSignaturesResponseBody setData(ListSignaturesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSignaturesResponseBodyData getData() {
        return this.data;
    }

    public ListSignaturesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListSignaturesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSignaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSignaturesResponseBodyDataSignatures extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListSignaturesResponseBodyDataSignatures build(java.util.Map<String, ?> map) throws Exception {
            ListSignaturesResponseBodyDataSignatures self = new ListSignaturesResponseBodyDataSignatures();
            return TeaModel.build(map, self);
        }

        public ListSignaturesResponseBodyDataSignatures setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListSignaturesResponseBodyDataSignatures setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSignaturesResponseBodyDataSignatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSignaturesResponseBodyDataSignatures setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSignaturesResponseBodyDataSignatures setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListSignaturesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Signatures")
        public java.util.List<ListSignaturesResponseBodyDataSignatures> signatures;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSignaturesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSignaturesResponseBodyData self = new ListSignaturesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSignaturesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSignaturesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSignaturesResponseBodyData setSignatures(java.util.List<ListSignaturesResponseBodyDataSignatures> signatures) {
            this.signatures = signatures;
            return this;
        }
        public java.util.List<ListSignaturesResponseBodyDataSignatures> getSignatures() {
            return this.signatures;
        }

        public ListSignaturesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
