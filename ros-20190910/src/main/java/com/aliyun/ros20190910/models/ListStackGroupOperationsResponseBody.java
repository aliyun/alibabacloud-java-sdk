// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationsResponseBody extends TeaModel {
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stack group operations.</p>
     */
    @NameInMap("StackGroupOperations")
    public java.util.List<ListStackGroupOperationsResponseBodyStackGroupOperations> stackGroupOperations;

    /**
     * <p>The total number of stack group operations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStackGroupOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationsResponseBody self = new ListStackGroupOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupOperationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackGroupOperationsResponseBody setStackGroupOperations(java.util.List<ListStackGroupOperationsResponseBodyStackGroupOperations> stackGroupOperations) {
        this.stackGroupOperations = stackGroupOperations;
        return this;
    }
    public java.util.List<ListStackGroupOperationsResponseBodyStackGroupOperations> getStackGroupOperations() {
        return this.stackGroupOperations;
    }

    public ListStackGroupOperationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStackGroupOperationsResponseBodyStackGroupOperations extends TeaModel {
        /**
         * <p>The operation type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CREATE</li>
         * <li>UPDATE</li>
         * <li>DELETE</li>
         * <li>DETECT_DRIFT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The time when the operation was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-20T09:22:36.000000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the operation ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-20T09:22:41.000000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The description of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Create stack instance in hangzhou</p>
         */
        @NameInMap("OperationDescription")
        public String operationDescription;

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761****</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The ID of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The state of the operation.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RUNNING</li>
         * <li>SUCCEEDED</li>
         * <li>FAILED</li>
         * <li>STOPPING</li>
         * <li>STOPPED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListStackGroupOperationsResponseBodyStackGroupOperations build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationsResponseBodyStackGroupOperations self = new ListStackGroupOperationsResponseBodyStackGroupOperations();
            return TeaModel.build(map, self);
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
