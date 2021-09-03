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
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Stack")
        public java.util.Map<String, ?> stack;

        @NameInMap("RequiredBy")
        public java.util.List<String> requiredBy;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        public static PreviewStackResponseBodyStackResources build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackResources self = new PreviewStackResponseBodyStackResources();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public PreviewStackResponseBodyStackResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public PreviewStackResponseBodyStackResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PreviewStackResponseBodyStackResources setStack(java.util.Map<String, ?> stack) {
            this.stack = stack;
            return this;
        }
        public java.util.Map<String, ?> getStack() {
            return this.stack;
        }

        public PreviewStackResponseBodyStackResources setRequiredBy(java.util.List<String> requiredBy) {
            this.requiredBy = requiredBy;
            return this;
        }
        public java.util.List<String> getRequiredBy() {
            return this.requiredBy;
        }

        public PreviewStackResponseBodyStackResources setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

    }

    public static class PreviewStackResponseBodyStack extends TeaModel {
        @NameInMap("TemplateDescription")
        public String templateDescription;

        @NameInMap("Parameters")
        public java.util.List<PreviewStackResponseBodyStackParameters> parameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisableRollback")
        public Boolean disableRollback;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        @NameInMap("StackPolicyBody")
        public java.util.Map<String, ?> stackPolicyBody;

        @NameInMap("Resources")
        public java.util.List<PreviewStackResponseBodyStackResources> resources;

        @NameInMap("RegionId")
        public String regionId;

        public static PreviewStackResponseBodyStack build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStack self = new PreviewStackResponseBodyStack();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStack setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public PreviewStackResponseBodyStack setParameters(java.util.List<PreviewStackResponseBodyStackParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackParameters> getParameters() {
            return this.parameters;
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

        public PreviewStackResponseBodyStack setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public PreviewStackResponseBodyStack setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public PreviewStackResponseBodyStack setStackPolicyBody(java.util.Map<String, ?> stackPolicyBody) {
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }
        public java.util.Map<String, ?> getStackPolicyBody() {
            return this.stackPolicyBody;
        }

        public PreviewStackResponseBodyStack setResources(java.util.List<PreviewStackResponseBodyStackResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackResources> getResources() {
            return this.resources;
        }

        public PreviewStackResponseBodyStack setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
