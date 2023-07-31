// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateResponseBody extends TeaModel {
    /**
     * <p>The DataSource resource types.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The path of the regular resource. In most cases, the path of a regular resource is the same as the resource name.</p>
     */
    @NameInMap("Outputs")
    public java.util.List<ValidateTemplateResponseBodyOutputs> outputs;

    /**
     * <p>The regular resources that are defined in the template.</p>
     * <br>
     * <p>> </p>
     * <p>*   For a Resource Orchestration Service (ROS) template, the resource whose definition contains the `Count` parameter is not displayed as a list.</p>
     * <p>*   For a Terraform template, the resource whose definition contains the `count` or `for_each` parameter is not displayed as a list.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<java.util.Map<String, ?>> parameters;

    /**
     * <p>The regular resource type.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters that can be modified. If you change only values of the parameters in a stack template and use the template to update the stack, no validation errors are caused.</p>
     */
    @NameInMap("ResourceTypes")
    public ValidateTemplateResponseBodyResourceTypes resourceTypes;

    /**
     * <p>The parameters whose changes cause service interruptions under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values and the update type determine whether service interruptions are caused.</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is supported only for a small number of resource types.</p>
     * <p>*   This parameter is valid only for changes that are made on ROS stacks.</p>
     */
    @NameInMap("Resources")
    public java.util.List<ValidateTemplateResponseBodyResources> resources;

    /**
     * <p>The parameters that can be modified under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether validation errors are caused.</p>
     */
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
        /**
         * <p>The update information about the stack.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameters that can be modified. If you change only values of the parameters in a stack template and use the template to update the stack, no validation errors are caused.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The pattern in which the logical IDs of regular resources are formed.</p>
         * <br>
         * <p>If resources are defined in an ROS template, the following rules apply:</p>
         * <br>
         * <p>*   Resource whose definition does not contain the `Count` parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern and `ResourcePath` parameters is `server`.</p>
         * <p>*   Resource whose definition contains the `Count` parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern parameter is `server[*]`, and the value of the `ResourcePath` parameter is `server`.</p>
         * <br>
         * <p>If resources and [modules](https://www.terraform.io/language/modules) are defined in a Terraform template, the following rules apply:</p>
         * <br>
         * <p>*   Resource and module whose definitions do not contain the [count](https://www.terraform.io/language/meta-arguments/count) or [for_each](https://www.terraform.io/language/meta-arguments/for_each) parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern and `ResourcePath` parameters is `server`.</p>
         * <p>*   Resource and module whose definitions contain the [count](https://www.terraform.io/language/meta-arguments/count) or [for_each](https://www.terraform.io/language/meta-arguments/for_each) parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern parameter is `server[*]`, and the value of the `ResourcePath` parameter is `server`.</p>
         * <br>
         * <p>Examples of the LogicalResourceIdPattern parameter for resources in a Terraform template:</p>
         * <br>
         * <p>*   Valid values of the LogicalResourceIdPattern parameter if a resource belongs to the root module:</p>
         * <br>
         * <p>    *   `server`: In this case, the `count` or `for_each` parameter is not contained in the resource. The value of the `ResourcePath` parameter is `server`.</p>
         * <p>    *   `server[*]`: In this case, the `count` or `for_each` parameter is contained in the resource. The value of the `ResourcePath` parameter is `server`.</p>
         * <br>
         * <p>*   Valid values of the LogicalResourceIdPattern parameter if a resource belongs to a child module:</p>
         * <br>
         * <p>    *   `app.server`: In this case, the `count` or `for_each` parameter is not contained in the `app` module and the `server` resource. The value of the `ResourcePath` parameter is `app.server`.</p>
         * <p>    *   `app.server[*]`: In this case, the `count` or `for_each` parameter is contained in the `server` resource, but not in the `app` module. The value of the `ResourcePath` parameter is `app.server`.</p>
         * <p>    *   `app[*].server`: In this case, the `count` or `for_each` parameter is contained in the `app` module, but not in the `server` resource. The value of the `ResourcePath` parameter is `app.server`.</p>
         * <p>    *   `app[*].server[*]`: In this case, the `count` or `for_each` parameter is contained in the `app` module and the `server` resource. The value of the `ResourcePath` parameter is `app.server`.</p>
         * <p>    *   `app.app_group[*].server`: In this case, the `count` or `for_each` parameter is contained in the `app_group` module, but not in the `app` module and the `server` resource. The value of the `ResourcePath` parameter is `app.app_group.server`. The `app_group` module is a child module of the `app` module.</p>
         */
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
        /**
         * <p>The parameters that can be modified under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values of the parameters determine whether validation errors are caused.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<String> dataSources;

        /**
         * <p>The parameters whose changes cause service interruptions. If you change only values of the parameters in a stack template and use the template to update the stack, service interruptions are caused.</p>
         * <br>
         * <p>> </p>
         * <p>*   This parameter is supported only for a small number of resource types.</p>
         * <p>*   This parameter is valid only for changes that are made on ROS stacks.</p>
         */
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
        /**
         * <p>The parameters that cannot be modified. If you change only values of the parameters in a stack template and use the template to update the stack, validation errors are caused.</p>
         */
        @NameInMap("LogicalResourceIdPattern")
        public String logicalResourceIdPattern;

        /**
         * <p>The parameters that cannot be modified. If you change only values of the parameters in a stack template and use the template to update the stack, validation errors are caused.</p>
         */
        @NameInMap("ResourcePath")
        public String resourcePath;

        /**
         * <p>The parameters whose changes cause service interruptions under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values and the update type determine whether service interruptions are caused.</p>
         * <br>
         * <p>> </p>
         * <p>*   This parameter is supported only for a small number of resource types.</p>
         * <p>*   This parameter is valid only for changes that are made on ROS stacks.</p>
         */
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
        /**
         * <p>The parameters that can be modified under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether validation errors are caused.</p>
         */
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        /**
         * <p>The parameters whose changes cause service interruptions under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether service interruptions are caused.</p>
         * <br>
         * <p>> </p>
         * <p>*   This parameter is supported only for a small number of resource types.</p>
         * <p>*   This parameter is valid only for changes that are made on ROS stacks.</p>
         */
        @NameInMap("ParametersCauseInterruptionIfModified")
        public java.util.List<String> parametersCauseInterruptionIfModified;

        @NameInMap("ParametersCauseReplacementIfModified")
        public java.util.List<String> parametersCauseReplacementIfModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        public java.util.List<String> parametersConditionallyCauseInterruptionIfModified;

        @NameInMap("ParametersConditionallyCauseReplacementIfModified")
        public java.util.List<String> parametersConditionallyCauseReplacementIfModified;

        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        public java.util.List<String> parametersUncertainlyAllowedToBeModified;

        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        public java.util.List<String> parametersUncertainlyCauseInterruptionIfModified;

        @NameInMap("ParametersUncertainlyCauseReplacementIfModified")
        public java.util.List<String> parametersUncertainlyCauseReplacementIfModified;

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

        public ValidateTemplateResponseBodyUpdateInfo setParametersCauseReplacementIfModified(java.util.List<String> parametersCauseReplacementIfModified) {
            this.parametersCauseReplacementIfModified = parametersCauseReplacementIfModified;
            return this;
        }
        public java.util.List<String> getParametersCauseReplacementIfModified() {
            return this.parametersCauseReplacementIfModified;
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

        public ValidateTemplateResponseBodyUpdateInfo setParametersConditionallyCauseReplacementIfModified(java.util.List<String> parametersConditionallyCauseReplacementIfModified) {
            this.parametersConditionallyCauseReplacementIfModified = parametersConditionallyCauseReplacementIfModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyCauseReplacementIfModified() {
            return this.parametersConditionallyCauseReplacementIfModified;
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

        public ValidateTemplateResponseBodyUpdateInfo setParametersUncertainlyCauseReplacementIfModified(java.util.List<String> parametersUncertainlyCauseReplacementIfModified) {
            this.parametersUncertainlyCauseReplacementIfModified = parametersUncertainlyCauseReplacementIfModified;
            return this;
        }
        public java.util.List<String> getParametersUncertainlyCauseReplacementIfModified() {
            return this.parametersUncertainlyCauseReplacementIfModified;
        }

    }

}
