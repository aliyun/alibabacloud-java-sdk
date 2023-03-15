// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackRequest extends TeaModel {
    /**
     * <p>Specifies whether only to validate the stack in the request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: only validates the stack.</p>
     * <p>*   false: validates and continues to create the stack.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The mode in which ROS continues to create the stack. Default value: Recreate. Valid values:</p>
     * <br>
     * <p>*   Recreate</p>
     * <br>
     * <p>    If you set this parameter to Recreate, ROS continues to create only the following types of resources:</p>
     * <br>
     * <p>    *   Resources that fail to be created</p>
     * <br>
     * <p>    *   Resources that you specify for the RecreatingResources.N parameter</p>
     * <br>
     * <p>    *   Dependencies of the resources that you specify for the RecreatingResources.N parameter</p>
     * <br>
     * <p>    *   Resources that you have not created</p>
     * <br>
     * <p>>  The RecreatingResources.N, TemplateBody, and TemplateURL parameters, and the Parameters section take effect only when the Mode parameter is set to Recreate.</p>
     * <br>
     * <p>*   Ignore</p>
     * <br>
     * <p>    *   ROS ignores and discards resources that fail to be created and you have not created, and marks the stack as successfully created.</p>
     * <br>
     * <p>    *   The body of the template that you use to create the stack is changed.</p>
     * <br>
     * <p>>  This value is valid only for ROS stacks.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The maximum number of concurrent operations that can be performed on resources.</p>
     * <br>
     * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
     * <br>
     * <p>> </p>
     * <p>*   If you set this parameter to an integer that is greater than 0, the integer is used.</p>
     * <p>*   If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <p>*   If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <p>*   If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack.</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public java.util.List<ContinueCreateStackRequestParameters> parameters;

    /**
     * <p>The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.</p>
     * <br>
     * <p>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.</p>
     * <br>
     * <p>If you do not specify this parameter, ROS assumes the existing RAM role that is associated with the stack. If no RAM roles are available, ROS uses a temporary credential that is generated from the credentials of your account.</p>
     * <br>
     * <p>The name of the RAM role can be up to 64 bytes in length.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>test</p>
     */
    @NameInMap("RecreatingOptions")
    public java.util.List<String> recreatingOptions;

    @NameInMap("RecreatingResources")
    public java.util.List<String> recreatingResources;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.</p>
     * <br>
     * <p>If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>An ROS template is subject to the following limits:</p>
     * <br>
     * <p>*   You can modify only the following sections in the template: Description, Metadata, Resources, and Outputs.</p>
     * <br>
     * <p>*   You cannot add sections to or remove sections from the template.</p>
     * <br>
     * <p>*   The Resources section is subject to the following limits:</p>
     * <br>
     * <p>    *   You cannot delete the resources or change the template body for the resources that you do not want to continue to create.</p>
     * <br>
     * <p>    *   You can delete the resources or change the template body for the resources that you want to continue to create.</p>
     * <br>
     * <p>    *   You can add resources to this section.</p>
     * <br>
     * <p>> *   This parameter takes effect only when the Mode parameter is set to Recreate.</p>
     * <p>   *   You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared templates and private templates.</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter takes effect when the `Mode` parameter is set to `Recreate`. When you specify the TemplateId parameter in a template, the template is subject to the limits that are described for the `TemplateBody` parameter in this topic.</p>
     * <p>*   You can specify only one of the following parameters: `TemplateBody`, `TemplateURL`, and `TemplateId`. If you do not specify the parameters, the existing template is used.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
     * <br>
     * <p>If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter takes effect only when the Mode parameter is set to Recreate. When you specify the TemplateURL parameter in a template, the template is subject to the limits that are described for the TemplateBody parameter in this topic.</p>
     * <p>*   You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when the TemplateId parameter is specified.</p>
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
         * <p>The name of template parameter N that you want to use to override another parameter. If you do not specify the name and value of a template parameter, ROS uses the name and value specified in the previous operation that was performed to create the stack. Maximum value of N: 200.</p>
         * <br>
         * <p>>  This parameter takes effect only when the Mode parameter is set to Recreate.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of template parameter N that you want to use to override another parameter. Maximum value of N: 200.</p>
         * <br>
         * <p>For ROS stacks, the following limits are imposed on the template parameters that you use to override other parameters:</p>
         * <br>
         * <p>*   You cannot change the condition values in the Conditions section of a template from true to false or from false to true.</p>
         * <p>*   The template parameters can be referenced only by resources that ROS continues to create.</p>
         * <br>
         * <p>>  This parameter takes effect only when the Mode parameter is set to Recreate.</p>
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
