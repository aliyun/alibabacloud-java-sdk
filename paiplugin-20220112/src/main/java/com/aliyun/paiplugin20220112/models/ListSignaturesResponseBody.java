// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListSignaturesResponseBody extends TeaModel {
    // 返回数据。
    @NameInMap("Data")
    public ListSignaturesResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
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
        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 签名Id。
        @NameInMap("Id")
        public String id;

        // 签名名称。
        @NameInMap("Name")
        public String name;

        // 签名审核状态。
        // - 0：审核中。
        // - 1：审核通过。
        // - 2：审核不通过。
        @NameInMap("Status")
        public Integer status;

        // 更新时间 (UTC+8)。
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
        // 分页数，从1开始，默认为1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10。
        @NameInMap("PageSize")
        public Integer pageSize;

        // 签名列表。
        @NameInMap("Signatures")
        public java.util.List<ListSignaturesResponseBodyDataSignatures> signatures;

        // 签名数量。
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
