// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Outputs")
    public java.util.List<ValidateTemplateResponseBodyOutputs> outputs;

    @NameInMap("Parameters")
    public java.util.List<java.util.Map<String, ?>> parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTypes")
    public ValidateTemplateResponseBodyResourceTypes resourceTypes;

    @NameInMap("Resources")
    public java.util.List<ValidateTemplateResponseBodyResources> resources;

    @NameInMap("UpdateInfo")
    public ValidateTemplateResponseBodyUpdateInfo updateInfo;

    public static ValidateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateResponseBody self = new ValidateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ValidateTemplateResponseBody setOutputs(java.util.List<ValidateTemplateResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<ValidateTemplateResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public ValidateTemplateResponseBody setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

    public ValidateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateTemplateResponseBody setResourceTypes(ValidateTemplateResponseBodyResourceTypes resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public ValidateTemplateResponseBodyResourceTypes getResourceTypes() {
        return this.resourceTypes;
    }

    public ValidateTemplateResponseBody setResources(java.util.List<ValidateTemplateResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ValidateTemplateResponseBodyResources> getResources() {
        return this.resources;
    }

    public ValidateTemplateResponseBody setUpdateInfo(ValidateTemplateResponseBodyUpdateInfo updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }
    public ValidateTemplateResponseBodyUpdateInfo getUpdateInfo() {
        return this.updateInfo;
    }

    public static class ValidateTemplateResponseBodyOutputs extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        @NameInMap("OutputKey")
        public String outputKey;

        public static ValidateTemplateResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            ValidateTemplateResponseBodyOutputs self = new ValidateTemplateResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public ValidateTemplateResponseBodyOutputs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ValidateTemplateResponseBodyOutputs setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ValidateTemplateResponseBodyOutputs setOutputKey(String outputKey) {
            this.outputKey = outputKey;
            return this;
        }
        public String getOutputKey() {
            return this.outputKey;
        }

    }

    public static class ValidateTemplateResponseBodyResourceTypes extends TeaModel {
        @NameInMap("DataSources")
        public java.util.List<String> dataSources;

        @NameInMap("Resources")
        public java.util.List<String> resources;

        public static ValidateTemplateResponseBodyResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ValidateTemplateResponseBodyResourceTypes self = new ValidateTemplateResponseBodyResourceTypes();
            return TeaModel.build(map, self);
        }

        public ValidateTemplateResponseBodyResourceTypes setDataSources(java.util.List<String> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        public ValidateTemplateResponseBodyResourceTypes setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

    }

    public static class ValidateTemplateResponseBodyResources extends TeaModel {
        @NameInMap("LogicalResourceIdPattern")
        public String logicalResourceIdPattern;

        @NameInMap("ResourcePath")
        public String resourcePath;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ValidateTemplateResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ValidateTemplateResponseBodyResources self = new ValidateTemplateResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ValidateTemplateResponseBodyResources setLogicalResourceIdPattern(String logicalResourceIdPattern) {
            this.logicalResourceIdPattern = logicalResourceIdPattern;
            return this;
        }
        public String getLogicalResourceIdPattern() {
            return this.logicalResourceIdPattern;
        }

        public ValidateTemplateResponseBodyResources setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }
        public String getResourcePath() {
            return this.resourcePath;
        }

        public ValidateTemplateResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ValidateTemplateResponseBodyUpdateInfo extends TeaModel {
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        @NameInMap("ParametersCauseInterruptionIfModified")
        public java.util.List<String> parametersCauseInterruptionIfModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        public java.util.List<String> parametersConditionallyCauseInterruptionIfModified;

        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        public java.util.List<String> parametersUncertainlyAllowedToBeModified;

        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        public java.util.List<String> parametersUncertainlyCauseInterruptionIfModified;

        public static ValidateTemplateResponseBodyUpdateInfo build(java.util.Map<String, ?> map) throws Exception {
            ValidateTemplateResponseBodyUpdateInfo self = new ValidateTemplateResponseBodyUpdateInfo();
            return TeaModel.build(map, self);
        }

        public ValidateTemplateResponseBodyUpdateInfo setParametersAllowedToBeModified(java.util.List<String> parametersAllowedToBeModified) {
            this.parametersAllowedToBeModified = parametersAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        public ValidateTemplateResponseBodyUpdateInfo setParametersCauseInterruptionIfModified(java.util.List<String> parametersCauseInterruptionIfModified) {
            this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
            return this;
        }
        public java.util.List<String> getParametersCauseInterruptionIfModified() {
            return this.parametersCauseInterruptionIfModified;
        }

        public ValidateTemplateResponseBodyUpdateInfo setParametersConditionallyAllowedToBeModified(java.util.List<String> parametersConditionallyAllowedToBeModified) {
            this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        public ValidateTemplateResponseBodyUpdateInfo setParametersConditionallyCauseInterruptionIfModified(java.util.List<String> parametersConditionallyCauseInterruptionIfModified) {
            this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyCauseInterruptionIfModified() {
            return this.parametersConditionallyCauseInterruptionIfModified;
        }

        public ValidateTemplateResponseBodyUpdateInfo setParametersNotAllowedToBeModified(java.util.List<String> parametersNotAllowedToBeModified) {
            this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

        public ValidateTemplateResponseBodyUpdateInfo setParametersUncertainlyAllowedToBeModified(java.util.List<String> parametersUncertainlyAllowedToBeModified) {
            this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersUncertainlyAllowedToBeModified() {
            return this.parametersUncertainlyAllowedToBeModified;
        }

        public ValidateTemplateResponseBodyUpdateInfo setParametersUncertainlyCauseInterruptionIfModified(java.util.List<String> parametersUncertainlyCauseInterruptionIfModified) {
            this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
            return this;
        }
        public java.util.List<String> getParametersUncertainlyCauseInterruptionIfModified() {
            return this.parametersUncertainlyCauseInterruptionIfModified;
        }

    }

}
