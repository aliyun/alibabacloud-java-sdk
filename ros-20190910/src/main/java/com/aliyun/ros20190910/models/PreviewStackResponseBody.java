// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Command")
        public String command;

        @NameInMap("Content")
        public String content;

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
        @NameInMap("ParameterKey")
        public String parameterKey;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("RequiredBy")
        public java.util.List<String> requiredBy;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Stack")
        public java.util.Map<String, ?> stack;

        public static PreviewStackResponseBodyStackResources build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackResources self = new PreviewStackResponseBodyStackResources();
            return TeaModel.build(map, self);
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

        public PreviewStackResponseBodyStackResources setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
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
        @NameInMap("Description")
        public String description;

        @NameInMap("DisableRollback")
        public Boolean disableRollback;

        @NameInMap("Log")
        public PreviewStackResponseBodyStackLog log;

        @NameInMap("Parameters")
        public java.util.List<PreviewStackResponseBodyStackParameters> parameters;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Resources")
        public java.util.List<PreviewStackResponseBodyStackResources> resources;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("StackPolicyBody")
        public java.util.Map<String, ?> stackPolicyBody;

        @NameInMap("TemplateDescription")
        public String templateDescription;

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
