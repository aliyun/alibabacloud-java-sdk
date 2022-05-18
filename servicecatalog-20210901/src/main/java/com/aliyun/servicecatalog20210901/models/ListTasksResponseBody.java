// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 实例列表
    @NameInMap("TaskDetails")
    public java.util.List<ListTasksResponseBodyTaskDetails> taskDetails;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTaskDetails(java.util.List<ListTasksResponseBodyTaskDetails> taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }
    public java.util.List<ListTasksResponseBodyTaskDetails> getTaskDetails() {
        return this.taskDetails;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksResponseBodyTaskDetails extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 模板参数
        @NameInMap("Inputs")
        public String inputs;

        // 模板日志
        @NameInMap("Log")
        public String log;

        // 模板输出
        @NameInMap("Outputs")
        public String outputs;

        // 产品组合ID
        @NameInMap("PortfolioId")
        public String portfolioId;

        // 产品ID
        @NameInMap("ProductId")
        public String productId;

        // 产品名称
        @NameInMap("ProductName")
        public String productName;

        // 产品版本ID
        @NameInMap("ProductVersionId")
        public String productVersionId;

        // 产品版本名称
        @NameInMap("ProductVersionName")
        public String productVersionName;

        // 实例ID
        @NameInMap("ProvisionedProductId")
        public String provisionedProductId;

        // 实例名称
        @NameInMap("ProvisionedProductName")
        public String provisionedProductName;

        // 实例状态
        @NameInMap("Status")
        public String status;

        // 实例状态说明
        @NameInMap("StatusMessage")
        public String statusMessage;

        // 实例名称
        @NameInMap("TaskId")
        public String taskId;

        // 实例ARN
        @NameInMap("TaskType")
        public String taskType;

        public static ListTasksResponseBodyTaskDetails build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTaskDetails self = new ListTasksResponseBodyTaskDetails();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTaskDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTasksResponseBodyTaskDetails setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public ListTasksResponseBodyTaskDetails setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public ListTasksResponseBodyTaskDetails setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListTasksResponseBodyTaskDetails setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public ListTasksResponseBodyTaskDetails setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListTasksResponseBodyTaskDetails setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListTasksResponseBodyTaskDetails setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public ListTasksResponseBodyTaskDetails setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public ListTasksResponseBodyTaskDetails setProvisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        public ListTasksResponseBodyTaskDetails setProvisionedProductName(String provisionedProductName) {
            this.provisionedProductName = provisionedProductName;
            return this;
        }
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        public ListTasksResponseBodyTaskDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyTaskDetails setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListTasksResponseBodyTaskDetails setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTasksResponseBodyTaskDetails setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
