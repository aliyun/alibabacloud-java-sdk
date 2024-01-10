// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResponseBody extends TeaModel {
    /**
     * <p>The number of resources on which drift detection is performed.</p>
     * <br>
     * <p>>  This parameter is returned only if the drift detection on the stack is successful.</p>
     */
    @NameInMap("CheckedStackResourceCount")
    public Integer checkedStackResourceCount;

    /**
     * <p>The time when the stack was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether deletion protection is enabled for the stack. Valid values:</p>
     * <br>
     * <p>*   Enabled: Deletion protection is enabled for the stack.</p>
     * <p>*   Disabled: Deletion protection is disabled for the stack. You can delete the stack in the Resource Orchestration Service (ROS) console or by calling the DeleteStack operation.</p>
     * <br>
     * <p>>  Deletion protection of a nested stack works in the same way as that of the root stack.</p>
     */
    @NameInMap("DeletionProtection")
    public String deletionProtection;

    /**
     * <p>The description of the stack.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether rollback is disabled when the stack fails to be created. Valid values:</p>
     * <br>
     * <p>*   true: Rollback is disabled when the stack fails to be created.</p>
     * <p>*   false: Rollback is enabled when the stack fails to be created. This is the default value.</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The time when the last successful drift detection operation was performed.</p>
     */
    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    /**
     * <p>The description of the web UI in the ROS console.</p>
     */
    @NameInMap("Interface")
    public String _interface;

    /**
     * <p>The logs of the stack.</p>
     */
    @NameInMap("Log")
    public GetStackResponseBodyLog log;

    /**
     * <p>The number of resources on which drift detection is not performed.</p>
     * <br>
     * <p>>  This parameter is returned only if the drift detection on the stack is successful.</p>
     */
    @NameInMap("NotCheckedStackResourceCount")
    public Integer notCheckedStackResourceCount;

    /**
     * <p>The callback URLs that are used to receive stack events.</p>
     */
    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    /**
     * <p>The additional information that is displayed when an error occurs on a stack operation. </p>
     * <br>
     * <p>>  This property is returned in specific conditions. At least one sub-property is returned. For example, an error is reported when you call the API of another cloud service.</p>
     */
    @NameInMap("OperationInfo")
    public GetStackResponseBodyOperationInfo operationInfo;

    /**
     * <p>The ID of the order. This parameter is returned only if you set the ChargeType parameter to PrePaid.</p>
     */
    @NameInMap("OrderIds")
    public java.util.List<String> orderIds;

    /**
     * <p>The output parameters of the stack.</p>
     * <br>
     * <p>>  This parameter is returned if the OutputOption parameter is set to Enabled.</p>
     */
    @NameInMap("Outputs")
    public java.util.List<java.util.Map<String, ?>> outputs;

    /**
     * <p>The parameters of the stack.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetStackResponseBodyParameters> parameters;

    /**
     * <p>The ID of the parent stack.</p>
     */
    @NameInMap("ParentStackId")
    public String parentStackId;

    /**
     * <p>The name of the RAM role. ROS assumes the RAM role to create the stack and uses credentials of the role to call the APIs of Alibaba Cloud services.</p>
     * <br>
     * <p>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the role.</p>
     * <br>
     * <p>If you do not specify this parameter, ROS assumes an existing role that is associated with the stack. If no roles are available for ROS to assume, ROS uses a temporary credential that is generated from the credentials of your account.</p>
     * <br>
     * <p>The name of the RAM role can be up to 64 bytes in length.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the region in which the stack is deployed. You can call the [DescribeRegions](~~131035~~) operation to query the most recent list of Alibaba Cloud regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the instances belong.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The creation progress of resources.</p>
     */
    @NameInMap("ResourceProgress")
    public GetStackResponseBodyResourceProgress resourceProgress;

    /**
     * <p>The ID of the root stack. This parameter is returned if the specified stack is a nested stack.</p>
     */
    @NameInMap("RootStackId")
    public String rootStackId;

    /**
     * <p>Indicates whether the stack is a managed stack. Valid values: </p>
     * <br>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The name of the service to which the managed stack belongs.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The status of the stack in the last successful drift detection. Valid values:</p>
     * <br>
     * <p>*   DRIFTED: The stack has drifted.</p>
     * <p>*   NOT_CHECKED: No successful drift detection is performed on the stack.</p>
     * <p>*   IN_SYNC: The stack is being synchronized.</p>
     */
    @NameInMap("StackDriftStatus")
    public String stackDriftStatus;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The name of the stack.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.</p>
     */
    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The type of the stack. Valid values:</p>
     * <br>
     * <p>*   ROS: The ROS stack, which is created by using an ROS template.</p>
     * <p>*   Terraform: The Terraform stack, which is created by using a Terraform template.</p>
     */
    @NameInMap("StackType")
    public String stackType;

    /**
     * <p>The state of the stack. Valid values:</p>
     * <br>
     * <p>*   CREATE_IN_PROGRESS: The stack is being created.</p>
     * <p>*   CREATE_FAILED: The stack fails to be created.</p>
     * <p>*   CREATE_COMPLETE: The stack is created.</p>
     * <p>*   UPDATE_IN_PROGRESS: The stack is being updated.</p>
     * <p>*   UPDATE_FAILED: The stack fails to be updated.</p>
     * <p>*   UPDATE_COMPLETE: The stack is updated.</p>
     * <p>*   DELETE_IN_PROGRESS: The stack is being deleted.</p>
     * <p>*   DELETE_FAILED: The stack fails to be deleted.</p>
     * <p>*   CREATE_ROLLBACK_IN_PROGRESS: The stack is being rolled back after the stack fails to be created.</p>
     * <p>*   CREATE_ROLLBACK_FAILED: The stack fails to be rolled back after the stack fails to be created.</p>
     * <p>*   CREATE_ROLLBACK_COMPLETE: The stack is rolled back after the stack fails to be created.</p>
     * <p>*   ROLLBACK_IN_PROGRESS: The resources in the stack are being rolled back.</p>
     * <p>*   ROLLBACK_FAILED: The resources in the stack fail to be rolled back.</p>
     * <p>*   ROLLBACK_COMPLETE: The resources in the stack are rolled back.</p>
     * <p>*   CHECK_IN_PROGRESS: The stack is being validated.</p>
     * <p>*   CHECK_FAILED: The stack fails to be validated.</p>
     * <p>*   CHECK_COMPLETE: The stack is validated.</p>
     * <p>*   REVIEW_IN_PROGRESS: The stack is being reviewed.</p>
     * <p>*   IMPORT_CREATE_IN_PROGRESS: The stack is being created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_FAILED: The stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_COMPLETE: The stack is created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_ROLLBACK_FAILED: The resources fail to be rolled back after the stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_IN_PROGRESS: The stack is being updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_FAILED: The stack fails to be updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_COMPLETE: The stack is updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack fails to be updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_ROLLBACK_FAILED: The resources fail to be rolled back after the stack fails to be updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack fails to be updated by using imported resources.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The reason why the stack is in its current state.</p>
     */
    @NameInMap("StatusReason")
    public String statusReason;

    /**
     * <p>The tags of the stack.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetStackResponseBodyTags> tags;

    /**
     * <p>The description of the template.</p>
     */
    @NameInMap("TemplateDescription")
    public String templateDescription;

    /**
     * <p>The ID of the template. This parameter is returned only if the current template of the stack is a custom template or a shared template.  </p>
     * <br>
     * <p>If the template is a shared template, the value of this parameter is the same as the value of the TemplateARN parameter.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the scenario. This parameter is returned only if the current template of the stack is generated from a scenario.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The URL of the file that contains the template body. This parameter is returned only if the current template of the stack is from a URL. The URL can point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter is returned only if the current template of the stack is a custom template or a shared template.  </p>
     * <br>
     * <p>If the template is a shared template, this parameter is returned only when the VersionOption parameter is set to AllVersions.  </p>
     * <br>
     * <p>Valid values: v1 to v100.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The timeout period within which the stack can be created. Unit: minutes.</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    /**
     * <p>The time when the stack was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponseBody self = new GetStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackResponseBody setCheckedStackResourceCount(Integer checkedStackResourceCount) {
        this.checkedStackResourceCount = checkedStackResourceCount;
        return this;
    }
    public Integer getCheckedStackResourceCount() {
        return this.checkedStackResourceCount;
    }

    public GetStackResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetStackResponseBody setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetStackResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetStackResponseBody setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public GetStackResponseBody setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackResponseBody set_interface(String _interface) {
        this._interface = _interface;
        return this;
    }
    public String get_interface() {
        return this._interface;
    }

    public GetStackResponseBody setLog(GetStackResponseBodyLog log) {
        this.log = log;
        return this;
    }
    public GetStackResponseBodyLog getLog() {
        return this.log;
    }

    public GetStackResponseBody setNotCheckedStackResourceCount(Integer notCheckedStackResourceCount) {
        this.notCheckedStackResourceCount = notCheckedStackResourceCount;
        return this;
    }
    public Integer getNotCheckedStackResourceCount() {
        return this.notCheckedStackResourceCount;
    }

    public GetStackResponseBody setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public GetStackResponseBody setOperationInfo(GetStackResponseBodyOperationInfo operationInfo) {
        this.operationInfo = operationInfo;
        return this;
    }
    public GetStackResponseBodyOperationInfo getOperationInfo() {
        return this.operationInfo;
    }

    public GetStackResponseBody setOrderIds(java.util.List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<String> getOrderIds() {
        return this.orderIds;
    }

    public GetStackResponseBody setOutputs(java.util.List<java.util.Map<String, ?>> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getOutputs() {
        return this.outputs;
    }

    public GetStackResponseBody setParameters(java.util.List<GetStackResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetStackResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetStackResponseBody setParentStackId(String parentStackId) {
        this.parentStackId = parentStackId;
        return this;
    }
    public String getParentStackId() {
        return this.parentStackId;
    }

    public GetStackResponseBody setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public GetStackResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetStackResponseBody setResourceProgress(GetStackResponseBodyResourceProgress resourceProgress) {
        this.resourceProgress = resourceProgress;
        return this;
    }
    public GetStackResponseBodyResourceProgress getResourceProgress() {
        return this.resourceProgress;
    }

    public GetStackResponseBody setRootStackId(String rootStackId) {
        this.rootStackId = rootStackId;
        return this;
    }
    public String getRootStackId() {
        return this.rootStackId;
    }

    public GetStackResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public GetStackResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetStackResponseBody setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }
    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    public GetStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackResponseBody setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetStackResponseBody setStackType(String stackType) {
        this.stackType = stackType;
        return this;
    }
    public String getStackType() {
        return this.stackType;
    }

    public GetStackResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetStackResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetStackResponseBody setTags(java.util.List<GetStackResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetStackResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetStackResponseBody setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public GetStackResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetStackResponseBody setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public GetStackResponseBody setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetStackResponseBody setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public GetStackResponseBody setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public GetStackResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetStackResponseBodyLogResourceLogsLogs extends TeaModel {
        /**
         * <p>The content of a resource log.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The keywords of a resource log.</p>
         */
        @NameInMap("Keys")
        public java.util.List<String> keys;

        public static GetStackResponseBodyLogResourceLogsLogs build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyLogResourceLogsLogs self = new GetStackResponseBodyLogResourceLogsLogs();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyLogResourceLogsLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetStackResponseBodyLogResourceLogsLogs setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

    }

    public static class GetStackResponseBodyLogResourceLogs extends TeaModel {
        /**
         * <p>The logs of all resources.</p>
         */
        @NameInMap("Logs")
        public java.util.List<GetStackResponseBodyLogResourceLogsLogs> logs;

        /**
         * <p>The name of the resource that is defined in the template.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        public static GetStackResponseBodyLogResourceLogs build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyLogResourceLogs self = new GetStackResponseBodyLogResourceLogs();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyLogResourceLogs setLogs(java.util.List<GetStackResponseBodyLogResourceLogsLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<GetStackResponseBodyLogResourceLogsLogs> getLogs() {
            return this.logs;
        }

        public GetStackResponseBodyLogResourceLogs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

    public static class GetStackResponseBodyLogTerraformLogs extends TeaModel {
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
         * <p>*   stdout: standard output stream</p>
         * <p>*   stderr: standard error stream</p>
         */
        @NameInMap("Stream")
        public String stream;

        public static GetStackResponseBodyLogTerraformLogs build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyLogTerraformLogs self = new GetStackResponseBodyLogTerraformLogs();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyLogTerraformLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetStackResponseBodyLogTerraformLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetStackResponseBodyLogTerraformLogs setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class GetStackResponseBodyLog extends TeaModel {
        /**
         * <p>The logs of resources in the stack. This parameter is returned if the LogOption parameter is set to Resource or All.  </p>
         * <br>
         * <p>>  The logs are returned for resources of specific types, such as `ALIYUN::ROS::ResourceCleaner`.</p>
         */
        @NameInMap("ResourceLogs")
        public java.util.List<GetStackResponseBodyLogResourceLogs> resourceLogs;

        /**
         * <p>The logs of the Terraform stack. This parameter is returned only for a Terraform stack. </p>
         * <br>
         * <p>This parameter is returned if the LogOption parameter is left empty or set to Stack or All.  </p>
         * <br>
         * <p>>  This parameter is not returned for a running stack. The logs are generated from the last creation, re-creation, update, or deletion operation on the stack.</p>
         */
        @NameInMap("TerraformLogs")
        public java.util.List<GetStackResponseBodyLogTerraformLogs> terraformLogs;

        public static GetStackResponseBodyLog build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyLog self = new GetStackResponseBodyLog();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyLog setResourceLogs(java.util.List<GetStackResponseBodyLogResourceLogs> resourceLogs) {
            this.resourceLogs = resourceLogs;
            return this;
        }
        public java.util.List<GetStackResponseBodyLogResourceLogs> getResourceLogs() {
            return this.resourceLogs;
        }

        public GetStackResponseBodyLog setTerraformLogs(java.util.List<GetStackResponseBodyLogTerraformLogs> terraformLogs) {
            this.terraformLogs = terraformLogs;
            return this;
        }
        public java.util.List<GetStackResponseBodyLogTerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

    }

    public static class GetStackResponseBodyOperationInfo extends TeaModel {
        /**
         * <p>The name of the API of another cloud service.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The logical ID of the resource on which the operation error occurred.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the request to call the API of another cloud service.</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The type of the resource on which the operation error occurred.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetStackResponseBodyOperationInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyOperationInfo self = new GetStackResponseBodyOperationInfo();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyOperationInfo setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetStackResponseBodyOperationInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStackResponseBodyOperationInfo setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public GetStackResponseBodyOperationInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetStackResponseBodyOperationInfo setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetStackResponseBodyOperationInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetStackResponseBodyParameters extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetStackResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyParameters self = new GetStackResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackResponseBodyParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetStackResponseBodyResourceProgressInProgressResourceDetails extends TeaModel {
        /**
         * <p>The desired progress value of the resource.</p>
         */
        @NameInMap("ProgressTargetValue")
        public Float progressTargetValue;

        /**
         * <p>The current progress value of the resource.</p>
         */
        @NameInMap("ProgressValue")
        public Float progressValue;

        /**
         * <p>The resource name.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetStackResponseBodyResourceProgressInProgressResourceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyResourceProgressInProgressResourceDetails self = new GetStackResponseBodyResourceProgressInProgressResourceDetails();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyResourceProgressInProgressResourceDetails setProgressTargetValue(Float progressTargetValue) {
            this.progressTargetValue = progressTargetValue;
            return this;
        }
        public Float getProgressTargetValue() {
            return this.progressTargetValue;
        }

        public GetStackResponseBodyResourceProgressInProgressResourceDetails setProgressValue(Float progressValue) {
            this.progressValue = progressValue;
            return this;
        }
        public Float getProgressValue() {
            return this.progressValue;
        }

        public GetStackResponseBodyResourceProgressInProgressResourceDetails setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetStackResponseBodyResourceProgressInProgressResourceDetails setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetStackResponseBodyResourceProgress extends TeaModel {
        /**
         * <p>The number of resources that fail to be created.</p>
         */
        @NameInMap("FailedResourceCount")
        public Integer failedResourceCount;

        /**
         * <p>The number of resources that are being created.</p>
         */
        @NameInMap("InProgressResourceCount")
        public Integer inProgressResourceCount;

        /**
         * <p>The progress details of resources that are being created.</p>
         */
        @NameInMap("InProgressResourceDetails")
        public java.util.List<GetStackResponseBodyResourceProgressInProgressResourceDetails> inProgressResourceDetails;

        /**
         * <p>The number of resources to be created.</p>
         */
        @NameInMap("PendingResourceCount")
        public Integer pendingResourceCount;

        @NameInMap("StackActionProgress")
        public Float stackActionProgress;

        @NameInMap("StackOperationProgress")
        public Float stackOperationProgress;

        /**
         * <p>The number of resources that are created.</p>
         */
        @NameInMap("SuccessResourceCount")
        public Integer successResourceCount;

        /**
         * <p>The total number of resources.</p>
         */
        @NameInMap("TotalResourceCount")
        public Integer totalResourceCount;

        public static GetStackResponseBodyResourceProgress build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyResourceProgress self = new GetStackResponseBodyResourceProgress();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyResourceProgress setFailedResourceCount(Integer failedResourceCount) {
            this.failedResourceCount = failedResourceCount;
            return this;
        }
        public Integer getFailedResourceCount() {
            return this.failedResourceCount;
        }

        public GetStackResponseBodyResourceProgress setInProgressResourceCount(Integer inProgressResourceCount) {
            this.inProgressResourceCount = inProgressResourceCount;
            return this;
        }
        public Integer getInProgressResourceCount() {
            return this.inProgressResourceCount;
        }

        public GetStackResponseBodyResourceProgress setInProgressResourceDetails(java.util.List<GetStackResponseBodyResourceProgressInProgressResourceDetails> inProgressResourceDetails) {
            this.inProgressResourceDetails = inProgressResourceDetails;
            return this;
        }
        public java.util.List<GetStackResponseBodyResourceProgressInProgressResourceDetails> getInProgressResourceDetails() {
            return this.inProgressResourceDetails;
        }

        public GetStackResponseBodyResourceProgress setPendingResourceCount(Integer pendingResourceCount) {
            this.pendingResourceCount = pendingResourceCount;
            return this;
        }
        public Integer getPendingResourceCount() {
            return this.pendingResourceCount;
        }

        public GetStackResponseBodyResourceProgress setStackActionProgress(Float stackActionProgress) {
            this.stackActionProgress = stackActionProgress;
            return this;
        }
        public Float getStackActionProgress() {
            return this.stackActionProgress;
        }

        public GetStackResponseBodyResourceProgress setStackOperationProgress(Float stackOperationProgress) {
            this.stackOperationProgress = stackOperationProgress;
            return this;
        }
        public Float getStackOperationProgress() {
            return this.stackOperationProgress;
        }

        public GetStackResponseBodyResourceProgress setSuccessResourceCount(Integer successResourceCount) {
            this.successResourceCount = successResourceCount;
            return this;
        }
        public Integer getSuccessResourceCount() {
            return this.successResourceCount;
        }

        public GetStackResponseBodyResourceProgress setTotalResourceCount(Integer totalResourceCount) {
            this.totalResourceCount = totalResourceCount;
            return this;
        }
        public Integer getTotalResourceCount() {
            return this.totalResourceCount;
        }

    }

    public static class GetStackResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key of the stack.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the stack.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetStackResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyTags self = new GetStackResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetStackResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
