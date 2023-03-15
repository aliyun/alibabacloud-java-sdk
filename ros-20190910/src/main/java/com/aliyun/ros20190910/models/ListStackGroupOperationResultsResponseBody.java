// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the results of the operation.</p>
     */
    @NameInMap("StackGroupOperationResults")
    public java.util.List<ListStackGroupOperationResultsResponseBodyStackGroupOperationResults> stackGroupOperationResults;

    /**
     * <p>The total number of results.</p>
     */
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
        /**
         * <p>The ID of the account to which the stack instance belongs.</p>
         * <br>
         * <p>*   If the stack group has self-managed permissions, the stack instance belongs to an Alibaba Cloud account.</p>
         * <p>*   If the stack group has service-managed permissions, the stack instance belongs to a member account in the resource directory.</p>
         * <br>
         * <p>>  For more information about the account, see [Overview](~~154578~~).</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The folder ID of the resource directory.</p>
         * <br>
         * <p>>  This parameter is returned only when the stack group is granted service-managed permissions.</p>
         */
        @NameInMap("RdFolderId")
        public String rdFolderId;

        /**
         * <p>The region ID of the stack instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the operation.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RUNNING: The operation is being performed.</p>
         * <p>*   SUCCEEDED: The operation succeeded.</p>
         * <p>*   FAILED: The operation failed.</p>
         * <p>*   STOPPING: The operation is being stopped.</p>
         * <p>*   STOPPED: The operation is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the operation is in a specific state.</p>
         * <br>
         * <p>>  This parameter is returned only when stack instances are in the OUTDATED state.</p>
         */
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
