// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("StackGroupOperations")
    public java.util.List<ListStackGroupOperationsResponseBodyStackGroupOperations> stackGroupOperations;

    public static ListStackGroupOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationsResponseBody self = new ListStackGroupOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListStackGroupOperationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackGroupOperationsResponseBody setStackGroupOperations(java.util.List<ListStackGroupOperationsResponseBodyStackGroupOperations> stackGroupOperations) {
        this.stackGroupOperations = stackGroupOperations;
        return this;
    }
    public java.util.List<ListStackGroupOperationsResponseBodyStackGroupOperations> getStackGroupOperations() {
        return this.stackGroupOperations;
    }

    public static class ListStackGroupOperationsResponseBodyStackGroupOperations extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Action")
        public String action;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("StackGroupName")
        public String stackGroupName;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("OperationDescription")
        public String operationDescription;

        public static ListStackGroupOperationsResponseBodyStackGroupOperations build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationsResponseBodyStackGroupOperations self = new ListStackGroupOperationsResponseBodyStackGroupOperations();
            return TeaModel.build(map, self);
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
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

        public ListStackGroupOperationsResponseBodyStackGroupOperations setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListStackGroupOperationsResponseBodyStackGroupOperations setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

    }

}
