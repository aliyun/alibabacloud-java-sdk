// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPublishBatchResponseBody extends TeaModel {
    /**
     * <p>The information about the release batches.</p>
     */
    @NameInMap("BatchList")
    public java.util.List<ListPublishBatchResponseBodyBatchList> batchList;

    /**
     * <p>The page information.</p>
     */
    @NameInMap("PageInfo")
    public ListPublishBatchResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPublishBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishBatchResponseBody self = new ListPublishBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishBatchResponseBody setBatchList(java.util.List<ListPublishBatchResponseBodyBatchList> batchList) {
        this.batchList = batchList;
        return this;
    }
    public java.util.List<ListPublishBatchResponseBodyBatchList> getBatchList() {
        return this.batchList;
    }

    public ListPublishBatchResponseBody setPageInfo(ListPublishBatchResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListPublishBatchResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListPublishBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublishBatchResponseBodyBatchList extends TeaModel {
        /**
         * <p>The ID of the release batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1371</p>
         */
        @NameInMap("BatchId")
        public Long batchId;

        /**
         * <p>The interval between two release batches. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("BatchInterval")
        public Integer batchInterval;

        /**
         * <p>The name of the release batch.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BatchName")
        public String batchName;

        /**
         * <p>The current batch number during a batch release.</p>
         * 
         * <strong>example:</strong>
         * <p>2147483647</p>
         */
        @NameInMap("BatchNo")
        public Integer batchNo;

        /**
         * <p>The progress of the release batch. This parameter indicates the number of servers that are upgraded in the release batch.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("BatchProcess")
        public Integer batchProcess;

        /**
         * <p>The total number of batches.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BatchTotal")
        public Integer batchTotal;

        /**
         * <p>The asset selection dimension. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: instance.</li>
         * <li><strong>1</strong>: machine group.</li>
         * <li><strong>2</strong>: Virtual Private Cloud (VPC) ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OperationBase")
        public Integer operationBase;

        /**
         * <p>The publish status of the Security Center agent. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not started.</li>
         * <li><strong>1</strong>: publishing.</li>
         * <li><strong>2</strong>: published.</li>
         * <li><strong>3</strong>: publish suspended.</li>
         * <li><strong>4</strong>: forcibly upgrading.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The destination version of the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.9</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListPublishBatchResponseBodyBatchList build(java.util.Map<String, ?> map) throws Exception {
            ListPublishBatchResponseBodyBatchList self = new ListPublishBatchResponseBodyBatchList();
            return TeaModel.build(map, self);
        }

        public ListPublishBatchResponseBodyBatchList setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public ListPublishBatchResponseBodyBatchList setBatchInterval(Integer batchInterval) {
            this.batchInterval = batchInterval;
            return this;
        }
        public Integer getBatchInterval() {
            return this.batchInterval;
        }

        public ListPublishBatchResponseBodyBatchList setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public String getBatchName() {
            return this.batchName;
        }

        public ListPublishBatchResponseBodyBatchList setBatchNo(Integer batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public Integer getBatchNo() {
            return this.batchNo;
        }

        public ListPublishBatchResponseBodyBatchList setBatchProcess(Integer batchProcess) {
            this.batchProcess = batchProcess;
            return this;
        }
        public Integer getBatchProcess() {
            return this.batchProcess;
        }

        public ListPublishBatchResponseBodyBatchList setBatchTotal(Integer batchTotal) {
            this.batchTotal = batchTotal;
            return this;
        }
        public Integer getBatchTotal() {
            return this.batchTotal;
        }

        public ListPublishBatchResponseBodyBatchList setOperationBase(Integer operationBase) {
            this.operationBase = operationBase;
            return this;
        }
        public Integer getOperationBase() {
            return this.operationBase;
        }

        public ListPublishBatchResponseBodyBatchList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListPublishBatchResponseBodyBatchList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListPublishBatchResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPublishBatchResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPublishBatchResponseBodyPageInfo self = new ListPublishBatchResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListPublishBatchResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListPublishBatchResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPublishBatchResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
