// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the change set.</p>
     * 
     * <strong>example:</strong>
     * <p>4c11658d-bd47-4dd0-ba64-727edc62****</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The name of the change set.</p>
     * 
     * <strong>example:</strong>
     * <p>ChangeSet_template</p>
     */
    @NameInMap("ChangeSetName")
    public String changeSetName;

    /**
     * <p>The type of the change set.</p>
     * 
     * <strong>example:</strong>
     * <p>UPDATE</p>
     */
    @NameInMap("ChangeSetType")
    public String changeSetType;

    /**
     * <p>The changes of the change set.</p>
     */
    @NameInMap("Changes")
    public java.util.List<java.util.Map<String, ?>> changes;

    /**
     * <p>The time when the change set was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-01T02:20:56</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the change set.</p>
     * 
     * <strong>example:</strong>
     * <p>It is a demo.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether rollback was performed when the stack failed to be created or updated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The execution status of the change set.</p>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("ExecutionStatus")
    public String executionStatus;

    /**
     * <p>The output logs of the change set.</p>
     */
    @NameInMap("Log")
    public GetChangeSetResponseBodyLog log;

    /**
     * <p>The parameters of the stack.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetChangeSetResponseBodyParameters> parameters;

    /**
     * <p>The region ID of the change set.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3766EE04-76DD-50F9-9C23-3AF136CD5708</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the stack with which the change set is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>a486fc19-ebb7-4ce9-a70b-554a7c3d****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The name of the stack with which the change set is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>stack_2021-10-13</p>
     */
    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The status of the change set.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE_COMPLETE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The reason why the change set is in its current state.</p>
     * 
     * <strong>example:</strong>
     * <p>too many changes.</p>
     */
    @NameInMap("StatusReason")
    public String statusReason;

    /**
     * <p>The template body of the change set.</p>
     * <blockquote>
     * <p>This parameter takes effect only if you set ShowTemplate to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The timeout period that is specified for the stack creation or update operation.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    public static GetChangeSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetResponseBody self = new GetChangeSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeSetResponseBody setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetChangeSetResponseBody setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public String getChangeSetName() {
        return this.changeSetName;
    }

    public GetChangeSetResponseBody setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }
    public String getChangeSetType() {
        return this.changeSetType;
    }

    public GetChangeSetResponseBody setChanges(java.util.List<java.util.Map<String, ?>> changes) {
        this.changes = changes;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getChanges() {
        return this.changes;
    }

    public GetChangeSetResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetChangeSetResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetChangeSetResponseBody setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public GetChangeSetResponseBody setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public GetChangeSetResponseBody setLog(GetChangeSetResponseBodyLog log) {
        this.log = log;
        return this;
    }
    public GetChangeSetResponseBodyLog getLog() {
        return this.log;
    }

    public GetChangeSetResponseBody setParameters(java.util.List<GetChangeSetResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetChangeSetResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetChangeSetResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetChangeSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeSetResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetChangeSetResponseBody setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetChangeSetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetChangeSetResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetChangeSetResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetChangeSetResponseBody setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class GetChangeSetResponseBodyLogTerraformLogs extends TeaModel {
        /**
         * <p>The name of the Terraform command that is run. Valid values:</p>
         * <ul>
         * <li>apply</li>
         * <li>plan</li>
         * <li>destroy</li>
         * <li>version</li>
         * </ul>
         * <p>For more information about Terraform commands, see <a href="https://www.terraform.io/cli/commands">Command</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>apply</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The content of the output stream that is returned after the command is run.</p>
         * 
         * <strong>example:</strong>
         * <p>Apply complete! Resources: 42 added, 0 changed, 0 destroyed.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The output stream. Valid values:</p>
         * <ul>
         * <li>stdout: standard output stream</li>
         * <li>stderr: standard error stream</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stdout</p>
         */
        @NameInMap("Stream")
        public String stream;

        public static GetChangeSetResponseBodyLogTerraformLogs build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseBodyLogTerraformLogs self = new GetChangeSetResponseBodyLogTerraformLogs();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseBodyLogTerraformLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetChangeSetResponseBodyLogTerraformLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetChangeSetResponseBodyLogTerraformLogs setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class GetChangeSetResponseBodyLog extends TeaModel {
        /**
         * <p>The Terraform logs. This parameter is returned only for change sets of Terraform stacks.</p>
         * <blockquote>
         * <p>This parameter is not returned for change sets that are in the Creating state. This parameter indicates the logs of the change set creation operation for Terraform stacks.</p>
         * </blockquote>
         */
        @NameInMap("TerraformLogs")
        public java.util.List<GetChangeSetResponseBodyLogTerraformLogs> terraformLogs;

        public static GetChangeSetResponseBodyLog build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseBodyLog self = new GetChangeSetResponseBodyLog();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseBodyLog setTerraformLogs(java.util.List<GetChangeSetResponseBodyLogTerraformLogs> terraformLogs) {
            this.terraformLogs = terraformLogs;
            return this;
        }
        public java.util.List<GetChangeSetResponseBodyLogTerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

    }

    public static class GetChangeSetResponseBodyParameters extends TeaModel {
        /**
         * <p>The key of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::Region</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetChangeSetResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseBodyParameters self = new GetChangeSetResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseBodyParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetChangeSetResponseBodyParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
