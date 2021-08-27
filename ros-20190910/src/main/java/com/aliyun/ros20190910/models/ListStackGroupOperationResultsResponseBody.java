// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("StackGroupOperationResults")
    public java.util.List<ListStackGroupOperationResultsResponseBodyStackGroupOperationResults> stackGroupOperationResults;

    public static ListStackGroupOperationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsResponseBody self = new ListStackGroupOperationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListStackGroupOperationResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackGroupOperationResultsResponseBody setStackGroupOperationResults(java.util.List<ListStackGroupOperationResultsResponseBodyStackGroupOperationResults> stackGroupOperationResults) {
        this.stackGroupOperationResults = stackGroupOperationResults;
        return this;
    }
    public java.util.List<ListStackGroupOperationResultsResponseBodyStackGroupOperationResults> getStackGroupOperationResults() {
        return this.stackGroupOperationResults;
    }

    public static class ListStackGroupOperationResultsResponseBodyStackGroupOperationResults extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("RegionId")
        public String regionId;

        public static ListStackGroupOperationResultsResponseBodyStackGroupOperationResults build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationResultsResponseBodyStackGroupOperationResults self = new ListStackGroupOperationResultsResponseBodyStackGroupOperationResults();
            return TeaModel.build(map, self);
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStackGroupOperationResultsResponseBodyStackGroupOperationResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
