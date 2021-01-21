// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("StackGroupOperationResults")
    @Validation(required = true)
    public java.util.List<ListStackGroupOperationResultsResponseStackGroupOperationResults> stackGroupOperationResults;

    public static ListStackGroupOperationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsResponse self = new ListStackGroupOperationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackGroupOperationResultsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupOperationResultsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupOperationResultsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackGroupOperationResultsResponse setStackGroupOperationResults(java.util.List<ListStackGroupOperationResultsResponseStackGroupOperationResults> stackGroupOperationResults) {
        this.stackGroupOperationResults = stackGroupOperationResults;
        return this;
    }
    public java.util.List<ListStackGroupOperationResultsResponseStackGroupOperationResults> getStackGroupOperationResults() {
        return this.stackGroupOperationResults;
    }

    public static class ListStackGroupOperationResultsResponseStackGroupOperationResults extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        public static ListStackGroupOperationResultsResponseStackGroupOperationResults build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationResultsResponseStackGroupOperationResults self = new ListStackGroupOperationResultsResponseStackGroupOperationResults();
            return TeaModel.build(map, self);
        }

        public ListStackGroupOperationResultsResponseStackGroupOperationResults setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListStackGroupOperationResultsResponseStackGroupOperationResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStackGroupOperationResultsResponseStackGroupOperationResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackGroupOperationResultsResponseStackGroupOperationResults setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
