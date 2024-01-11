// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\</p>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-).\</p>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to disable rollback for the resources when the stack fails to be created. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>Specifies whether to query the parameters that you want to use in compliance precheck.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("EnablePreConfig")
    public Boolean enablePreConfig;

    /**
     * <p>The maximum number of concurrent operations that can be performed on resources. This parameter takes effect only for Terraform stacks.</p>
     * <br>
     * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
     * <br>
     * <p>> If you set this parameter to an integer greater than 0, the integer is used. If you set this parameter to 0 or leave this parameter empty, the default value of Terraform is used. In most cases, the default value of Terraform is 10.</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>The parameters of the stack.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<PreviewStackRequestParameters> parameters;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stack ID. You can use this parameter to preview a stack that you want to update.</p>
     * <br>
     * <br>
     * <br>
     * <p>> -  You must and can specify only one of StackName and StackId.</p>
     * <p>> - In the scenario in which you preview a stack that you want to create or update, you cannot preview the resources in its nested stacks.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The stack name. You can use this parameter to preview the stack that you want to create. The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.</p>
     * <br>
     * <p>> You must and can specify only one of StackName and StackId.</p>
     */
    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.</p>
     * <br>
     * <p>> You can specify only one of StackPolicyBody and StackPolicyURL.</p>
     */
    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    /**
     * <p>The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * <br>
     * <p>> You can specify only one of StackPolicyBody and StackPolicyURL.</p>
     * <br>
     * <p>The URL can be up to 1,350 bytes in length.</p>
     */
    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>> You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The scenario ID.</p>
     * <br>
     * <p>For more information about how to query the scenario ID, see [ListTemplateScratches](~~363050~~).</p>
     * <br>
     * <p>> You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The region ID of the scenario. The default value is the same as the value of RegionId.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("TemplateScratchRegionId")
    public String templateScratchRegionId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * <br>
     * <p>> You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when TemplateId is specified.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The timeout period for creating the stack.</p>
     * <br>
     * <p>Unit: minutes.</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    public static PreviewStackRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackRequest self = new PreviewStackRequest();
        return TeaModel.build(map, self);
    }

    public PreviewStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PreviewStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public PreviewStackRequest setEnablePreConfig(Boolean enablePreConfig) {
        this.enablePreConfig = enablePreConfig;
        return this;
    }
    public Boolean getEnablePreConfig() {
        return this.enablePreConfig;
    }

    public PreviewStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public PreviewStackRequest setParameters(java.util.List<PreviewStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<PreviewStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public PreviewStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreviewStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public PreviewStackRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public PreviewStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public PreviewStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public PreviewStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public PreviewStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public PreviewStackRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public PreviewStackRequest setTemplateScratchRegionId(String templateScratchRegionId) {
        this.templateScratchRegionId = templateScratchRegionId;
        return this;
    }
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
    }

    public PreviewStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public PreviewStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public PreviewStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class PreviewStackRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter N. If you do not specify the name and value of a parameter, Resource Orchestration Service (ROS) uses the default name and value that are specified in the template. Maximum value of N: 200.</p>
         * <br>
         * <p>> If you specify Parameters, you must specify Parameters.N.ParameterKey.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N. Maximum value of N: 200.</p>
         * <br>
         * <p>> If you specify Parameters, you must specify Parameters.N.ParameterValue.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static PreviewStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackRequestParameters self = new PreviewStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public PreviewStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public PreviewStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
