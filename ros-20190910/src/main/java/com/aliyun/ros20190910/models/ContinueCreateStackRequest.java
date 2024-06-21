// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackRequest extends TeaModel {
    /**
     * <p>Specifies whether only to validate the stack in the request. Valid values:</p>
     * <ul>
     * <li>true: only validates the stack.</li>
     * <li>false (default): validates and continues to create the stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The mode in which ROS continues to create the stack. Valid values:</p>
     * <ul>
     * <li><p>Recreate (default)</p>
     * <p>If you set this parameter to Recreate, ROS continues to create only the following types of resources:</p>
     * <ul>
     * <li>Resources that fail to be created</li>
     * <li>Resources that you specify for RecreatingResources.N</li>
     * <li>Dependencies of the resources that you specify for RecreatingResources.N</li>
     * <li>Resources that you have not created</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>RecreatingResources.N, TemplateBody, TemplateURL, and Parameters take effect only when Mode is set to Recreate.</p>
     * </blockquote>
     * <ul>
     * <li><p>Ignore</p>
     * <ul>
     * <li>ROS ignores and discards resources that fail to be created and you have not created, and considers that the stack is successfully created.</li>
     * <li>The body of the template that you use to create the stack is changed.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This mode is available only for ROS stacks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Recreate</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The maximum number of concurrent operations that can be performed on resources.</p>
     * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
     * <blockquote>
     * <ul>
     * <li>If you set this parameter to an integer that is greater than 0, the integer is used.</li>
     * <li>If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
     * <li>If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
     * <li>If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>The template parameters that you want to use to override specific parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<ContinueCreateStackRequestParameters> parameters;

    /**
     * <p>The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.\
     * ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.\
     * If you do not specify this parameter, ROS assumes the existing role that is associated with the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.\
     * The name of the RAM role can be up to 64 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test-role</p>
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
     * <blockquote>
     * <p>This parameter is available only for ROS stacks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WebServer</p>
     */
    @NameInMap("RecreatingResources")
    public java.util.List<String> recreatingResources;

    /**
     * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stack ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.\
     * If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <p>A ROS template is subject to the following limits:</p>
     * <ul>
     * <li><p>You can modify only the following sections in the template: Description, Metadata, Resources, and Outputs.</p>
     * </li>
     * <li><p>You cannot add sections to or remove sections from the template.</p>
     * </li>
     * <li><p>The Resources section is subject to the following limits:</p>
     * <ul>
     * <li>You cannot delete the resources or change the template body for the resources that you do not want to continue to create.</li>
     * <li>You can delete the resources or change the template body for the resources that you want to continue to create.</li>
     * <li>You can add resources to this section.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when Mode is set to Recreate.</li>
     * <li>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared and private templates.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect when <code>Mode</code> is set to <code>Recreate</code>. When you specify TemplateId of a template, the template is subject to the limits that are described for <code>TemplateBody</code> in this topic.</li>
     * <li>You can specify only one of the following parameters: <code>TemplateBody</code>, <code>TemplateURL</code>, and <code>TemplateId</code>. If you do not specify the parameters, the existing template is used.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
     * <p>If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when Mode is set to Recreate. When you specify TemplateURL of a template, the template is subject to the limits that are described for TemplateBody in this topic.</li>
     * <li>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when TemplateId is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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
         * <blockquote>
         * <p>This parameter takes effect only when Mode is set to Recreate.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of template parameter N that you want to use to override a specific parameter. Maximum value of N: 200.</p>
         * <p>For ROS stacks, the template parameters that you use to override specific parameters are subject to the following limits:</p>
         * <ul>
         * <li>You cannot change the condition values in the Conditions section of a template from true to false or from false to true.</li>
         * <li>The template parameters can be referenced only by resources that ROS continues to create.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when Mode is set to Recreate.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
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
