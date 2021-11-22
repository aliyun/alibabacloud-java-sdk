// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackGroupOperationResults")
    public java.util.List<ListStackGroupOperationResultsResponseBodyStackGroupOperationResults> stackGroupOperationResults;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStackGroupOperationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsResponseBody self = new ListStackGroupOperationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationResultsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupOperationResultsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupOperationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackGroupOperationResultsResponseBody setStackGroupOperationResults(java.util.List<ListStackGroupOperationResultsResponseBodyStackGroupOperationResults> stackGroupOperationResults) {
        this.stackGroupOperationResults = stackGroupOperationResults;
        return this;
    }
    public java.util.List<ListStackGroupOperationResultsResponseBodyStackGroupOperationResults> getStackGroupOperationResults() {
        return this.stackGroupOperationResults;
    }

    public ListStackGroupOperationResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStackGroupOperationResultsResponseBodyStackGroupOperationResults extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("RdFolderId")
        public String rdFolderId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        public static ListStackGroupOperationResultsResponseBodyStackGroupOperationResults build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationResultsResponseBodyStackGroupOperationResults self = new ListStackGroupOperationResultsResponseBodyStackGroupOperationResults();
            return TeaModel.build(map, self);
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setRdFolderId(String rdFolderId) {
            this.rdFolderId = rdFolderId;
            return this;
        }
        public String getRdFolderId() {
            return this.rdFolderId;
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
