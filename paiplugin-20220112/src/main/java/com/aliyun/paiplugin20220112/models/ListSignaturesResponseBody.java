// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListSignaturesResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public ListSignaturesResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
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
        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>签名Id。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>签名名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>签名审核状态。</p>
         * <p>- 0：审核中。</p>
         * <p>- 1：审核通过。</p>
         * <p>- 2：审核不通过。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
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
        /**
         * <p>分页数，从1开始，默认为1。</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>分页大小，默认为10。</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>分页返回的签名列表。</p>
         */
        @NameInMap("Signatures")
        public java.util.List<ListSignaturesResponseBodyDataSignatures> signatures;

        /**
         * <p>账号下全部签名注册记录数量。</p>
         */
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
