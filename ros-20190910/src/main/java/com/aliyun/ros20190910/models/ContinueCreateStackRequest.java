// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackRequest extends TeaModel {
    /**
     * <p>Specifies whether only to validate the stack in the request. Valid values:</p>
     * <br>
     * <p>*   true: only validates the stack.</p>
     * <p>*   false (default): validates and continues to create the stack.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The mode in which ROS continues to create the stack. Valid values:</p>
     * <br>
     * <p>*   Recreate (default)</p>
     * <br>
     * <p>    If you set this parameter to Recreate, ROS continues to create only the following types of resources:</p>
     * <br>
     * <p>    *   Resources that fail to be created</p>
     * <p>    *   Resources that you specify for RecreatingResources.N</p>
     * <p>    *   Dependencies of the resources that you specify for RecreatingResources.N</p>
     * <p>    *   Resources that you have not created</p>
     * <br>
     * <p>> RecreatingResources.N, TemplateBody, TemplateURL, and Parameters take effect only when Mode is set to Recreate.</p>
     * <br>
     * <p>*   Ignore</p>
     * <br>
     * <p>    *   ROS ignores and discards resources that fail to be created and you have not created, and considers that the stack is successfully created.</p>
     * <p>    *   The body of the template that you use to create the stack is changed.</p>
     * <br>
     * <p>> This mode is available only for ROS stacks.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The maximum number of concurrent operations that can be performed on resources.</p>
     * <br>
     * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
     * <br>
     * <p>> - If you set this parameter to an integer that is greater than 0, the integer is used.</p>
     * <p>> - If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <p>> - If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <p>> - If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack.</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>The template parameters that you want to use to override specific parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<ContinueCreateStackRequestParameters> parameters;

    /**
     * <p>The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.\</p>
     * <p>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.\</p>
     * <p>If you do not specify this parameter, ROS assumes the existing role that is associated with the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.\</p>
     * <p>The name of the RAM role can be up to 64 bytes in length.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The options that ROS adopts when ROS continues to create the stack.</p>
     */
    @NameInMap("RecreatingOptions")
    public java.util.List<String> recreatingOptions;

    /**
     * <p>The resources that ROS continues to create after the resources failed to be created. You can add new resources to the resources that ROS continues to create. ROS continues to create all dependencies of the new resources.</p>
     * <br>
     * <p>> This parameter is available only for ROS stacks.</p>
     */
    @NameInMap("RecreatingResources")
    public java.util.List<String> recreatingResources;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stack ID.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.\</p>
     * <p>If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>A ROS template is subject to the following limits:</p>
     * <br>
     * <p>*   You can modify only the following sections in the template: Description, Metadata, Resources, and Outputs.</p>
     * <br>
     * <p>*   You cannot add sections to or remove sections from the template.</p>
     * <br>
     * <p>*   The Resources section is subject to the following limits:</p>
     * <br>
     * <p>    *   You cannot delete the resources or change the template body for the resources that you do not want to continue to create.</p>
     * <p>    *   You can delete the resources or change the template body for the resources that you want to continue to create.</p>
     * <p>    *   You can add resources to this section.</p>
     * <br>
     * <p> </p>
     * <br>
     * <p>> - This parameter takes effect only when Mode is set to Recreate.</p>
     * <p>> - You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>> - This parameter takes effect when `Mode` is set to `Recreate`. When you specify TemplateId of a template, the template is subject to the limits that are described for `TemplateBody` in this topic.</p>
     * <p>> - You can specify only one of the following parameters: `TemplateBody`, `TemplateURL`, and `TemplateId`. If you do not specify the parameters, the existing template is used.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
     * <br>
     * <p>If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * <br>
     * <p>> - This parameter takes effect only when Mode is set to Recreate. When you specify TemplateURL of a template, the template is subject to the limits that are described for TemplateBody in this topic.</p>
     * <p>> - You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when TemplateId is specified.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static ContinueCreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackRequest self = new ContinueCreateStackRequest();
        return TeaModel.build(map, self);
    }

    public ContinueCreateStackRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ContinueCreateStackRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ContinueCreateStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public ContinueCreateStackRequest setParameters(java.util.List<ContinueCreateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<ContinueCreateStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public ContinueCreateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ContinueCreateStackRequest setRecreatingOptions(java.util.List<String> recreatingOptions) {
        this.recreatingOptions = recreatingOptions;
        return this;
    }
    public java.util.List<String> getRecreatingOptions() {
        return this.recreatingOptions;
    }

    public ContinueCreateStackRequest setRecreatingResources(java.util.List<String> recreatingResources) {
        this.recreatingResources = recreatingResources;
        return this;
    }
    public java.util.List<String> getRecreatingResources() {
        return this.recreatingResources;
    }

    public ContinueCreateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ContinueCreateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ContinueCreateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public ContinueCreateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ContinueCreateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public ContinueCreateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class ContinueCreateStackRequestParameters extends TeaModel {
        /**
         * <p>The name of template parameter N that you want to use to override a specific parameter. If you do not specify the name and value of a template parameter, ROS uses the name and value specified in the previous operation that was performed to create the stack. Maximum value of N: 200.</p>
         * <br>
         * <p>> This parameter takes effect only when Mode is set to Recreate.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of template parameter N that you want to use to override a specific parameter. Maximum value of N: 200.</p>
         * <br>
         * <p>For ROS stacks, the template parameters that you use to override specific parameters are subject to the following limits:</p>
         * <br>
         * <p>*   You cannot change the condition values in the Conditions section of a template from true to false or from false to true.</p>
         * <p>*   The template parameters can be referenced only by resources that ROS continues to create.</p>
         * <br>
         * <p>> This parameter takes effect only when Mode is set to Recreate.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static ContinueCreateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ContinueCreateStackRequestParameters self = new ContinueCreateStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public ContinueCreateStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public ContinueCreateStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
