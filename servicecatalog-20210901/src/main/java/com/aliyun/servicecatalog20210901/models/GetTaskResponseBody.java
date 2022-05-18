// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 任务信息
    @NameInMap("TaskDetail")
    public GetTaskResponseBodyTaskDetail taskDetail;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setTaskDetail(GetTaskResponseBodyTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public GetTaskResponseBodyTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static class GetTaskResponseBodyTaskDetail extends TeaModel {
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

        // 任务状态
        @NameInMap("Status")
        public String status;

        // 任务状态说明
        @NameInMap("StatusMessage")
        public String statusMessage;

        // 任务ID
        @NameInMap("TaskId")
        public String taskId;

        // 任务类型
        @NameInMap("TaskType")
        public String taskType;

        public static GetTaskResponseBodyTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDetail self = new GetTaskResponseBodyTaskDetail();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTaskDetail setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public GetTaskResponseBodyTaskDetail setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public GetTaskResponseBodyTaskDetail setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public GetTaskResponseBodyTaskDetail setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public GetTaskResponseBodyTaskDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetTaskResponseBodyTaskDetail setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetTaskResponseBodyTaskDetail setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public GetTaskResponseBodyTaskDetail setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public GetTaskResponseBodyTaskDetail setProvisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        public GetTaskResponseBodyTaskDetail setProvisionedProductName(String provisionedProductName) {
            this.provisionedProductName = provisionedProductName;
            return this;
        }
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        public GetTaskResponseBodyTaskDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyTaskDetail setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public GetTaskResponseBodyTaskDetail setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskResponseBodyTaskDetail setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
