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

    public static class GetTaskResponseBodyTaskDetailLogTerraformLogs extends TeaModel {
        @NameInMap("Command")
        public String command;

        @NameInMap("Content")
        public String content;

        @NameInMap("Stream")
        public String stream;

        public static GetTaskResponseBodyTaskDetailLogTerraformLogs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDetailLogTerraformLogs self = new GetTaskResponseBodyTaskDetailLogTerraformLogs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDetailLogTerraformLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetTaskResponseBodyTaskDetailLogTerraformLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskResponseBodyTaskDetailLogTerraformLogs setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class GetTaskResponseBodyTaskDetailLog extends TeaModel {
        @NameInMap("TerraformLogs")
        public java.util.List<GetTaskResponseBodyTaskDetailLogTerraformLogs> terraformLogs;

        public static GetTaskResponseBodyTaskDetailLog build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDetailLog self = new GetTaskResponseBodyTaskDetailLog();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDetailLog setTerraformLogs(java.util.List<GetTaskResponseBodyTaskDetailLogTerraformLogs> terraformLogs) {
            this.terraformLogs = terraformLogs;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskDetailLogTerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

    }

    public static class GetTaskResponseBodyTaskDetailOutputs extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("OutputKey")
        public String outputKey;

        @NameInMap("OutputValue")
        public String outputValue;

        public static GetTaskResponseBodyTaskDetailOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDetailOutputs self = new GetTaskResponseBodyTaskDetailOutputs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDetailOutputs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskResponseBodyTaskDetailOutputs setOutputKey(String outputKey) {
            this.outputKey = outputKey;
            return this;
        }
        public String getOutputKey() {
            return this.outputKey;
        }

        public GetTaskResponseBodyTaskDetailOutputs setOutputValue(String outputValue) {
            this.outputValue = outputValue;
            return this;
        }
        public String getOutputValue() {
            return this.outputValue;
        }

    }

    public static class GetTaskResponseBodyTaskDetailParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetTaskResponseBodyTaskDetailParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDetailParameters self = new GetTaskResponseBodyTaskDetailParameters();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDetailParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTaskResponseBodyTaskDetailParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetTaskResponseBodyTaskDetail extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Log")
        public GetTaskResponseBodyTaskDetailLog log;

        @NameInMap("Outputs")
        public java.util.List<GetTaskResponseBodyTaskDetailOutputs> outputs;

        @NameInMap("Parameters")
        public java.util.List<GetTaskResponseBodyTaskDetailParameters> parameters;

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

        @NameInMap("UpdateTime")
        public String updateTime;

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

        public GetTaskResponseBodyTaskDetail setLog(GetTaskResponseBodyTaskDetailLog log) {
            this.log = log;
            return this;
        }
        public GetTaskResponseBodyTaskDetailLog getLog() {
            return this.log;
        }

        public GetTaskResponseBodyTaskDetail setOutputs(java.util.List<GetTaskResponseBodyTaskDetailOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskDetailOutputs> getOutputs() {
            return this.outputs;
        }

        public GetTaskResponseBodyTaskDetail setParameters(java.util.List<GetTaskResponseBodyTaskDetailParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskDetailParameters> getParameters() {
            return this.parameters;
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

        public GetTaskResponseBodyTaskDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
