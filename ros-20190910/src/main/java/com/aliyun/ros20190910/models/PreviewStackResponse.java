// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Stack")
    @Validation(required = true)
    public PreviewStackResponseStack stack;

    public static PreviewStackResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackResponse self = new PreviewStackResponse();
        return TeaModel.build(map, self);
    }

    public PreviewStackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewStackResponse setStack(PreviewStackResponseStack stack) {
        this.stack = stack;
        return this;
    }
    public PreviewStackResponseStack getStack() {
        return this.stack;
    }

    public static class PreviewStackResponseStackParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static PreviewStackResponseStackParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseStackParameters self = new PreviewStackResponseStackParameters();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseStackParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public PreviewStackResponseStackParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class PreviewStackResponseStackResources extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("Properties")
        @Validation(required = true)
        public java.util.Map<String, ?> properties;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Stack")
        @Validation(required = true)
        public java.util.Map<String, ?> stack;

        @NameInMap("RequiredBy")
        @Validation(required = true)
        public java.util.List<String> requiredBy;

        public static PreviewStackResponseStackResources build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseStackResources self = new PreviewStackResponseStackResources();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseStackResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PreviewStackResponseStackResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public PreviewStackResponseStackResources setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public PreviewStackResponseStackResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public PreviewStackResponseStackResources setStack(java.util.Map<String, ?> stack) {
            this.stack = stack;
            return this;
        }
        public java.util.Map<String, ?> getStack() {
            return this.stack;
        }

        public PreviewStackResponseStackResources setRequiredBy(java.util.List<String> requiredBy) {
            this.requiredBy = requiredBy;
            return this;
        }
        public java.util.List<String> getRequiredBy() {
            return this.requiredBy;
        }

    }

    public static class PreviewStackResponseStack extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DisableRollback")
        @Validation(required = true)
        public Boolean disableRollback;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("StackName")
        @Validation(required = true)
        public String stackName;

        @NameInMap("StackPolicyBody")
        @Validation(required = true)
        public java.util.Map<String, ?> stackPolicyBody;

        @NameInMap("TemplateDescription")
        @Validation(required = true)
        public String templateDescription;

        @NameInMap("TimeoutInMinutes")
        @Validation(required = true)
        public Integer timeoutInMinutes;

        @NameInMap("Parameters")
        @Validation(required = true)
        public java.util.List<PreviewStackResponseStackParameters> parameters;

        @NameInMap("Resources")
        @Validation(required = true)
        public java.util.List<PreviewStackResponseStackResources> resources;

        public static PreviewStackResponseStack build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseStack self = new PreviewStackResponseStack();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseStack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PreviewStackResponseStack setDisableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        public PreviewStackResponseStack setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public PreviewStackResponseStack setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public PreviewStackResponseStack setStackPolicyBody(java.util.Map<String, ?> stackPolicyBody) {
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }
        public java.util.Map<String, ?> getStackPolicyBody() {
            return this.stackPolicyBody;
        }

        public PreviewStackResponseStack setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public PreviewStackResponseStack setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public PreviewStackResponseStack setParameters(java.util.List<PreviewStackResponseStackParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<PreviewStackResponseStackParameters> getParameters() {
            return this.parameters;
        }

        public PreviewStackResponseStack setResources(java.util.List<PreviewStackResponseStackResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<PreviewStackResponseStackResources> getResources() {
            return this.resources;
        }

    }

}
