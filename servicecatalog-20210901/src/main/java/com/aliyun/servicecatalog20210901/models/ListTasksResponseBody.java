// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskDetails")
    public java.util.List<ListTasksResponseBodyTaskDetails> taskDetails;

    /**
     * <strong>example:</strong>
     * <p>2</p>
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
         * <strong>example:</strong>
         * <p>apply</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <strong>example:</strong>
         * <p>Apply complete! Resources: 42 added, 0 changed, 0 destroyed.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>stdout</p>
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
         * <strong>example:</strong>
         * <p>The ECS instance ID.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>instance_id</p>
         */
        @NameInMap("OutputKey")
        public String outputKey;

        /**
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
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
         * <strong>example:</strong>
         * <p>instance_type</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <strong>example:</strong>
         * <p>ecs.s6-c1m1.small</p>
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
         * <strong>example:</strong>
         * <p>2022-05-23T09:46:27Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Log")
        public ListTasksResponseBodyTaskDetailsLog log;

        @NameInMap("Outputs")
        public java.util.List<ListTasksResponseBodyTaskDetailsOutputs> outputs;

        @NameInMap("Parameters")
        public java.util.List<ListTasksResponseBodyTaskDetailsParameters> parameters;

        /**
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        @NameInMap("PortfolioId")
        public String portfolioId;

        /**
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>pv-bp15e79d26****</p>
         */
        @NameInMap("ProductVersionId")
        public String productVersionId;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <strong>example:</strong>
         * <p>pp-bp1ddg1n2a****</p>
         */
        @NameInMap("ProvisionedProductId")
        public String provisionedProductId;

        @NameInMap("ProvisionedProductName")
        public String provisionedProductName;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Resource CREATE failed: terraform stack sc-146611588617****-pp-bp1ddg1n2a**** failure...</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>task-bp1dmg242c****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>LaunchProduct</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <strong>example:</strong>
         * <p>2022-05-26T03:28:45Z</p>
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
