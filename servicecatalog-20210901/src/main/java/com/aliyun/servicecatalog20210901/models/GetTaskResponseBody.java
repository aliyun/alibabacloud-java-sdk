// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the task.</p>
     */
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
        /**
         * <p>The name of the Terraform command that is run. Valid values:</p>
         * <br>
         * <p>*   apply</p>
         * <p>*   plan</p>
         * <p>*   destroy</p>
         * <p>*   version</p>
         * <br>
         * <p>For more information about Terraform commands, see [Basic CLI Features](https://www.terraform.io/cli/commands).</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The content of the output stream that is returned after the command is run.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The output stream. Valid values:</p>
         * <br>
         * <p>*   stdout: a standard output stream</p>
         * <p>*   stderr: a standard error stream</p>
         */
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
        /**
         * <p>The Terraform logs.</p>
         */
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
        /**
         * <p>The description of the output parameter for the template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the output parameter for the template.</p>
         */
        @NameInMap("OutputKey")
        public String outputKey;

        /**
         * <p>The value of the output parameter for the template.</p>
         */
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
        /**
         * <p>The name of the input parameter for the template.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the input parameter for the template.</p>
         */
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

    public static class GetTaskResponseBodyTaskDetailTaskTags extends TeaModel {
        /**
         * <p>The custom tag key.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The custom tag value.</p>
         * <br>
         * <p>The value must be 1 to 128 characters in length. It cannot start with `acs:` and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTaskResponseBodyTaskDetailTaskTags build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDetailTaskTags self = new GetTaskResponseBodyTaskDetailTaskTags();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDetailTaskTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTaskResponseBodyTaskDetailTaskTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskResponseBodyTaskDetail extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The logs of the instance.</p>
         */
        @NameInMap("Log")
        public GetTaskResponseBodyTaskDetailLog log;

        /**
         * <p>The output parameters of the template.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<GetTaskResponseBodyTaskDetailOutputs> outputs;

        /**
         * <p>The parameters that are specified in the template.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<GetTaskResponseBodyTaskDetailParameters> parameters;

        /**
         * <p>The ID of the product portfolio.</p>
         */
        @NameInMap("PortfolioId")
        public String portfolioId;

        /**
         * <p>The ID of the product.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The name of the product.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The ID of the product version.</p>
         */
        @NameInMap("ProductVersionId")
        public String productVersionId;

        /**
         * <p>The name of the product version.</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>The ID of the product instance.</p>
         */
        @NameInMap("ProvisionedProductId")
        public String provisionedProductId;

        /**
         * <p>The name of the product instance.</p>
         */
        @NameInMap("ProvisionedProductName")
        public String provisionedProductName;

        /**
         * <p>The state of the task. Valid values:</p>
         * <br>
         * <p>*   Succeeded: The task was successful.</p>
         * <p>*   InProgress: The task was in progress.</p>
         * <p>*   Failed: The task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The message that is returned for the status of the task.</p>
         * <br>
         * <p>> This parameter is returned only when Failed is returned for the Status parameter.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The custom tags.</p>
         */
        @NameInMap("TaskTags")
        public java.util.List<GetTaskResponseBodyTaskDetailTaskTags> taskTags;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   LaunchProduct: a task that launches the product.</p>
         * <p>*   UpdateProvisionedProduct: a task that updates the information about the product instance.</p>
         * <p>*   TerminateProvisionedProduct: a task that terminates the product instance.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The time when the task was last modified.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
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

        public GetTaskResponseBodyTaskDetail setTaskTags(java.util.List<GetTaskResponseBodyTaskDetailTaskTags> taskTags) {
            this.taskTags = taskTags;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskDetailTaskTags> getTaskTags() {
            return this.taskTags;
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
