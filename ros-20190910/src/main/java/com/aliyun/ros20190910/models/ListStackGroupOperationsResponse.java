// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationsResponse extends TeaModel {
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

    @NameInMap("StackGroupOperations")
    @Validation(required = true)
    public java.util.List<ListStackGroupOperationsResponseStackGroupOperations> stackGroupOperations;

    public static ListStackGroupOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationsResponse self = new ListStackGroupOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackGroupOperationsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupOperationsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupOperationsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackGroupOperationsResponse setStackGroupOperations(java.util.List<ListStackGroupOperationsResponseStackGroupOperations> stackGroupOperations) {
        this.stackGroupOperations = stackGroupOperations;
        return this;
    }
    public java.util.List<ListStackGroupOperationsResponseStackGroupOperations> getStackGroupOperations() {
        return this.stackGroupOperations;
    }

    public static class ListStackGroupOperationsResponseStackGroupOperations extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("OperationId")
        @Validation(required = true)
        public String operationId;

        @NameInMap("OperationDescription")
        @Validation(required = true)
        public String operationDescription;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListStackGroupOperationsResponseStackGroupOperations build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationsResponseStackGroupOperations self = new ListStackGroupOperationsResponseStackGroupOperations();
            return TeaModel.build(map, self);
        }

        public ListStackGroupOperationsResponseStackGroupOperations setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackGroupOperationsResponseStackGroupOperations setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackGroupOperationsResponseStackGroupOperations setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListStackGroupOperationsResponseStackGroupOperations setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public ListStackGroupOperationsResponseStackGroupOperations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackGroupOperationsResponseStackGroupOperations setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListStackGroupOperationsResponseStackGroupOperations setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListStackGroupOperationsResponseStackGroupOperations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
