// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the stack that is previewed.</p>
     */
    @NameInMap("Stack")
    public PreviewStackResponseBodyStack stack;

    public static PreviewStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackResponseBody self = new PreviewStackResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewStackResponseBody setStack(PreviewStackResponseBodyStack stack) {
        this.stack = stack;
        return this;
    }
    public PreviewStackResponseBodyStack getStack() {
        return this.stack;
    }

    public static class PreviewStackResponseBodyStackLogTerraformLogs extends TeaModel {
        /**
         * <p>The name of the Terraform command. Valid values:</p>
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

        public static PreviewStackResponseBodyStackLogTerraformLogs build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackLogTerraformLogs self = new PreviewStackResponseBodyStackLogTerraformLogs();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackLogTerraformLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public PreviewStackResponseBodyStackLogTerraformLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PreviewStackResponseBodyStackLogTerraformLogs setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class PreviewStackResponseBodyStackLog extends TeaModel {
        /**
         * <p>The log that is generated when a Terraform stack is run. This parameter is returned only if the stack is a Terraform stack.</p>
         * <br>
         * <p>>  You can use this parameter to preview the logs of a Terraform stack.</p>
         */
        @NameInMap("TerraformLogs")
        public java.util.List<PreviewStackResponseBodyStackLogTerraformLogs> terraformLogs;

        public static PreviewStackResponseBodyStackLog build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackLog self = new PreviewStackResponseBodyStackLog();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackLog setTerraformLogs(java.util.List<PreviewStackResponseBodyStackLogTerraformLogs> terraformLogs) {
            this.terraformLogs = terraformLogs;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackLogTerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

    }

    public static class PreviewStackResponseBodyStackParameters extends TeaModel {
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

        public static PreviewStackResponseBodyStackParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackParameters self = new PreviewStackResponseBodyStackParameters();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public PreviewStackResponseBodyStackParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class PreviewStackResponseBodyStackResources extends TeaModel {
        /**
         * <p>The type of the resource that belongs to an Alibaba Cloud service.</p>
         */
        @NameInMap("AcsResourceType")
        public String acsResourceType;

        /**
         * <p>The action that is performed on resources. Valid values:</p>
         * <br>
         * <p>*   Add</p>
         * <p>*   Modify</p>
         * <p>*   Remove</p>
         * <p>*   None</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The description of the resource.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The logical ID of the resource.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The physical ID of the resource.</p>
         * <br>
         * <p>This parameter is returned only if the Action parameter is set to Modify or Remove.</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The properties of the resource.</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>Indicates whether a replacement update is performed on the template. Valid values:</p>
         * <br>
         * <p>*   True: A replacement update is performed on the template.</p>
         * <p>*   False: A change is made on the template.</p>
         * <p>*   Conditional: A replacement update may be performed on the template. You can check whether a replacement update is performed when the template is in use.</p>
         * <br>
         * <p>>  This parameter is returned only if the Action parameter is set to Modify.</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        /**
         * <p>The resources on which the stack depends.</p>
         */
        @NameInMap("RequiredBy")
        public java.util.List<String> requiredBy;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The information about the nested stack. The data structure of the value is the same as the data structure of the entire response.</p>
         */
        @NameInMap("Stack")
        public java.util.Map<String, ?> stack;

        public static PreviewStackResponseBodyStackResources build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackResources self = new PreviewStackResponseBodyStackResources();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackResources setAcsResourceType(String acsResourceType) {
            this.acsResourceType = acsResourceType;
            return this;
        }
        public String getAcsResourceType() {
            return this.acsResourceType;
        }

        public PreviewStackResponseBodyStackResources setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public PreviewStackResponseBodyStackResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PreviewStackResponseBodyStackResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public PreviewStackResponseBodyStackResources setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public PreviewStackResponseBodyStackResources setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public PreviewStackResponseBodyStackResources setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

        public PreviewStackResponseBodyStackResources setRequiredBy(java.util.List<String> requiredBy) {
            this.requiredBy = requiredBy;
            return this;
        }
        public java.util.List<String> getRequiredBy() {
            return this.requiredBy;
        }

        public PreviewStackResponseBodyStackResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public PreviewStackResponseBodyStackResources setStack(java.util.Map<String, ?> stack) {
            this.stack = stack;
            return this;
        }
        public java.util.Map<String, ?> getStack() {
            return this.stack;
        }

    }

    public static class PreviewStackResponseBodyStack extends TeaModel {
        /**
         * <p>The description of the stack.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether rollback is disabled for the resources when the stack fails to be created.</p>
         */
        @NameInMap("DisableRollback")
        public Boolean disableRollback;

        /**
         * <p>The log that is generated when the stack is run.</p>
         */
        @NameInMap("Log")
        public PreviewStackResponseBodyStackLog log;

        /**
         * <p>The parameters of the stack.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<PreviewStackResponseBodyStackParameters> parameters;

        /**
         * <p>The region ID of the stack.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resources in the stack.</p>
         */
        @NameInMap("Resources")
        public java.util.List<PreviewStackResponseBodyStackResources> resources;

        /**
         * <p>The name of the stack.</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The structure that contains the stack policy body.</p>
         */
        @NameInMap("StackPolicyBody")
        public java.util.Map<String, ?> stackPolicyBody;

        /**
         * <p>The description of the template.</p>
         */
        @NameInMap("TemplateDescription")
        public String templateDescription;

        /**
         * <p>The timeout period that is allowed to create the stack.</p>
         * <br>
         * <p>Unit: minutes.</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        public static PreviewStackResponseBodyStack build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStack self = new PreviewStackResponseBodyStack();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PreviewStackResponseBodyStack setDisableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        public PreviewStackResponseBodyStack setLog(PreviewStackResponseBodyStackLog log) {
            this.log = log;
            return this;
        }
        public PreviewStackResponseBodyStackLog getLog() {
            return this.log;
        }

        public PreviewStackResponseBodyStack setParameters(java.util.List<PreviewStackResponseBodyStackParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackParameters> getParameters() {
            return this.parameters;
        }

        public PreviewStackResponseBodyStack setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public PreviewStackResponseBodyStack setResources(java.util.List<PreviewStackResponseBodyStackResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackResources> getResources() {
            return this.resources;
        }

        public PreviewStackResponseBodyStack setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public PreviewStackResponseBodyStack setStackPolicyBody(java.util.Map<String, ?> stackPolicyBody) {
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }
        public java.util.Map<String, ?> getStackPolicyBody() {
            return this.stackPolicyBody;
        }

        public PreviewStackResponseBodyStack setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public PreviewStackResponseBodyStack setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

    }

}
