// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
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
     * <p>The tasks.</p>
     */
    @NameInMap("TaskDetails")
    public java.util.List<ListTasksResponseBodyTaskDetails> taskDetails;

    /**
     * <p>The total number of entries returned.</p>
     */
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

    public static class ListTasksResponseBodyTaskDetailsLogTerraformLogs extends TeaModel {
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

        public static ListTasksResponseBodyTaskDetailsLogTerraformLogs build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTaskDetailsLogTerraformLogs self = new ListTasksResponseBodyTaskDetailsLogTerraformLogs();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTaskDetailsLogTerraformLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListTasksResponseBodyTaskDetailsLogTerraformLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListTasksResponseBodyTaskDetailsLogTerraformLogs setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class ListTasksResponseBodyTaskDetailsLog extends TeaModel {
        /**
         * <p>The Terraform logs.</p>
         */
        @NameInMap("TerraformLogs")
        public java.util.List<ListTasksResponseBodyTaskDetailsLogTerraformLogs> terraformLogs;

        public static ListTasksResponseBodyTaskDetailsLog build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTaskDetailsLog self = new ListTasksResponseBodyTaskDetailsLog();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTaskDetailsLog setTerraformLogs(java.util.List<ListTasksResponseBodyTaskDetailsLogTerraformLogs> terraformLogs) {
            this.terraformLogs = terraformLogs;
            return this;
        }
        public java.util.List<ListTasksResponseBodyTaskDetailsLogTerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

    }

    public static class ListTasksResponseBodyTaskDetailsOutputs extends TeaModel {
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

        public static ListTasksResponseBodyTaskDetailsOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTaskDetailsOutputs self = new ListTasksResponseBodyTaskDetailsOutputs();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTaskDetailsOutputs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTasksResponseBodyTaskDetailsOutputs setOutputKey(String outputKey) {
            this.outputKey = outputKey;
            return this;
        }
        public String getOutputKey() {
            return this.outputKey;
        }

        public ListTasksResponseBodyTaskDetailsOutputs setOutputValue(String outputValue) {
            this.outputValue = outputValue;
            return this;
        }
        public String getOutputValue() {
            return this.outputValue;
        }

    }

    public static class ListTasksResponseBodyTaskDetailsParameters extends TeaModel {
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

        public static ListTasksResponseBodyTaskDetailsParameters build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTaskDetailsParameters self = new ListTasksResponseBodyTaskDetailsParameters();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTaskDetailsParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public ListTasksResponseBodyTaskDetailsParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class ListTasksResponseBodyTaskDetails extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The logs of the product instance.</p>
         */
        @NameInMap("Log")
        public ListTasksResponseBodyTaskDetailsLog log;

        /**
         * <p>The output parameters of the template.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<ListTasksResponseBodyTaskDetailsOutputs> outputs;

        /**
         * <p>The input parameters of the template.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<ListTasksResponseBodyTaskDetailsParameters> parameters;

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

        public ListTasksResponseBodyTaskDetails setLog(ListTasksResponseBodyTaskDetailsLog log) {
            this.log = log;
            return this;
        }
        public ListTasksResponseBodyTaskDetailsLog getLog() {
            return this.log;
        }

        public ListTasksResponseBodyTaskDetails setOutputs(java.util.List<ListTasksResponseBodyTaskDetailsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<ListTasksResponseBodyTaskDetailsOutputs> getOutputs() {
            return this.outputs;
        }

        public ListTasksResponseBodyTaskDetails setParameters(java.util.List<ListTasksResponseBodyTaskDetailsParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<ListTasksResponseBodyTaskDetailsParameters> getParameters() {
            return this.parameters;
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

        public ListTasksResponseBodyTaskDetails setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
