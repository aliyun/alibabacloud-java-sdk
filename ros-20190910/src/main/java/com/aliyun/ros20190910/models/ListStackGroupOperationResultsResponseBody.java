// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li>If the stack group has self-managed permissions, the stack instance belongs to an Alibaba Cloud account.</li>
         * <li>If the stack group has service-managed permissions, the stack instance belongs to a member account in the resource directory.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about the account, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>175458090349****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The folder ID of the resource directory.</p>
         * <blockquote>
         * <p> This parameter is returned only when the stack group is granted service-managed permissions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>&quot;fd-4PvlVLOL8v&quot;</p>
         */
        @NameInMap("RdFolderId")
        public String rdFolderId;

        /**
         * <p>The region ID of the stack instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the operation.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RUNNING: The operation is being performed.</li>
         * <li>SUCCEEDED: The operation succeeded.</li>
         * <li>FAILED: The operation failed.</li>
         * <li>STOPPING: The operation is being stopped.</li>
         * <li>STOPPED: The operation is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the operation is in a specific state.</p>
         * <blockquote>
         * <p> This parameter is returned only when stack instances are in the OUTDATED state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>User initiated operation</p>
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
