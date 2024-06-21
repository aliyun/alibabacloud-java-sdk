// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateResponseBody extends TeaModel {
    /**
     * <p>The description of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The outputs of the template.</p>
     */
    @NameInMap("Outputs")
    public java.util.List<ValidateTemplateResponseBodyOutputs> outputs;

    /**
     * <p>The parameters that are defined in the Parameters section of the template.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<java.util.Map<String, ?>> parameters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource types that are used in the template.</p>
     */
    @NameInMap("ResourceTypes")
    public ValidateTemplateResponseBodyResourceTypes resourceTypes;

    /**
     * <p>The regular resources that are defined in the template.</p>
     * <blockquote>
     * <ul>
     * <li>For a Resource Orchestration Service (ROS) template, the resource whose definition contains <code>Count</code> is not displayed as a list.</li>
     * <li>For a Terraform template, the resource whose definition contains <code>count</code> or <code>for_each</code> is not displayed as a list.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("Resources")
    public java.util.List<ValidateTemplateResponseBodyResources> resources;

    /**
     * <p>The information about the stack update. This parameter cannot be returned if the value of UpdateInfoOptions contains Disabled.</p>
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
         * <p>The description of the template output.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance ID of my ECS.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The alias of the template output.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance ID</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The name of the template output.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_id</p>
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
         * <p>The DataSource resource types that are used in the template. The value is deduplicated.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<String> dataSources;

        /**
         * <p>The regular resource types that are used in the template. The value is deduplicated.</p>
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
         * <p>The pattern in which the logical IDs of regular resources are formed.</p>
         * <p>If resources are defined in a ROS template, the following rules apply:</p>
         * <ul>
         * <li>Resource whose definition does not contain <code>Count</code>: If the resource name defined in the template is <code>server</code>, the values of LogicalResourceIdPattern and <code>ResourcePath</code> are both <code>server</code>.``</li>
         * <li>Resource whose definition contains <code>Count</code>: If the resource name defined in the template is <code>server</code>, the value of LogicalResourceIdPattern is <code>server[*]</code>, and the value of <code>ResourcePath</code> is <code>server</code>.</li>
         * </ul>
         * <p>If resources and <a href="https://www.terraform.io/language/modules">modules</a> are defined in a Terraform template, the following rules apply:</p>
         * <ul>
         * <li>Resource and module whose definitions do not contain <a href="https://www.terraform.io/language/meta-arguments/count"><code>count</code></a> or <a href="https://www.terraform.io/language/meta-arguments/for_each"><code>for_each</code></a>: If the resource name defined in the template is <code>server</code>, the values of LogicalResourceIdPattern and <code>ResourcePath</code> are both <code>server</code>.``</li>
         * <li>Resource and module whose definitions contain <a href="https://www.terraform.io/language/meta-arguments/count"><code>count</code></a> or <a href="https://www.terraform.io/language/meta-arguments/for_each"><code>for_each</code></a>: If the resource name defined in the template is <code>server</code>, the value of LogicalResourceIdPattern is <code>server[*]</code>, and the value of <code>ResourcePath</code> is <code>server</code>.</li>
         * </ul>
         * <p>Examples of LogicalResourceIdPattern for resources in a Terraform template:</p>
         * <ul>
         * <li><p>Valid values of LogicalResourceIdPattern if a resource belongs to the root module:</p>
         * <ul>
         * <li><code>server</code>: In this case, <code>count</code> and <code>for_each</code> are not contained in the resource. The value of <code>ResourcePath</code> is <code>server</code>.</li>
         * <li><code>server[*]</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the resource. The value of <code>ResourcePath</code> is <code>server</code>.</li>
         * </ul>
         * </li>
         * <li><p>Valid values of LogicalResourceIdPattern if a resource belongs to a child module:</p>
         * <ul>
         * <li><code>app.server</code>: In this case, <code>count</code> and <code>for_each</code> are not contained in the <code>app</code> module and the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.server</code>.````</li>
         * <li><code>app.server[*]</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>server</code> resource, but <code>count</code> and <code>for_each</code> are not contained in the <code>app</code> module. The value of <code>ResourcePath</code> is <code>app.server</code>.</li>
         * <li><code>app[*].server</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>app</code> module, but <code>count</code> and <code>for_each</code> are not contained in the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.server</code>.</li>
         * <li><code>app[*].server[*]</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>app</code> module and the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.server</code>.````</li>
         * <li><code>app.app_group[*].server</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>app_group</code> module, but <code>count</code> and <code>for_each</code> are not contained in the <code>app</code> module and the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.app_group.server</code>. The <code>app_group</code> module is a child module of the <code>app</code> module.````</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>server</p>
         */
        @NameInMap("LogicalResourceIdPattern")
        public String logicalResourceIdPattern;

        /**
         * <p>The path of the regular resource. In most cases, the path of a regular resource is the same as the resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>server</p>
         */
        @NameInMap("ResourcePath")
        public String resourcePath;

        /**
         * <p>The regular resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::InstanceGroup</p>
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
         * <p>The parameters that can be modified.</p>
         */
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        /**
         * <p>The parameters whose changes cause service interruptions.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only for a small number of resource types.</li>
         * <li>This parameter is valid only for updates on ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersCauseInterruptionIfModified")
        public java.util.List<String> parametersCauseInterruptionIfModified;

        /**
         * <p>The parameters whose changes trigger replacement updates for resources.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.</li>
         * <li>This parameter is valid only for updates on ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersCauseReplacementIfModified")
        public java.util.List<String> parametersCauseReplacementIfModified;

        /**
         * <p>The parameters that can be modified under specific conditions.</p>
         */
        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        /**
         * <p>The parameters whose changes cause service interruptions under specific conditions.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only for a small number of resource types.</li>
         * <li>This parameter is valid only for updates on ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        public java.util.List<String> parametersConditionallyCauseInterruptionIfModified;

        /**
         * <p>The parameters whose changes trigger replacement updates for resources under specific conditions.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.</li>
         * <li>This parameter is valid only for updates on ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersConditionallyCauseReplacementIfModified")
        public java.util.List<String> parametersConditionallyCauseReplacementIfModified;

        /**
         * <p>The parameters that cannot be modified.</p>
         */
        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        /**
         * <p>The parameters that can be modified under uncertain conditions.</p>
         */
        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        public java.util.List<String> parametersUncertainlyAllowedToBeModified;

        /**
         * <p>The parameters whose changes cause service interruptions under uncertain conditions.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only for a small number of resource types.</li>
         * <li>This parameter is valid only for updates on ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        public java.util.List<String> parametersUncertainlyCauseInterruptionIfModified;

        /**
         * <p>The parameters whose changes trigger replacement updates for resources under uncertain conditions.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.</li>
         * <li>This parameter is valid only for updates on ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
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
