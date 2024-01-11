// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to roll back the resources in the stack when the stack fails to be updated.</p>
     * <br>
     * <p>Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>Specifies whether only to validate the stack in the request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: only validates the stack.</p>
     * <p>*   false: validates and updates the stack.</p>
     * <br>
     * <p>>  When no changes are made during the update, the following rules apply: If you set the DryRun parameter to false, the NotSupported error code is returned. If you set the DryRun parameter to true, no error is reported.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The dry run option in the list format. You can specify only one dry run option.</p>
     * <br>
     * <p>> This parameter takes effect only when DryRun is set to true.</p>
     */
    @NameInMap("DryRunOptions")
    public java.util.List<String> dryRunOptions;

    /**
     * <p>The maximum number of concurrent operations that can be performed on resources.</p>
     * <br>
     * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
     * <br>
     * <p>> - If you set this parameter to an integer that is greater than 0, the integer is used.</p>
     * <p>> -  If you set this parameter to 0, no limit is imposed on Resource Orchestration Service (ROS) stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <p>> -  If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <p>> - If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack.</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>The parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateStackRequestParameters> parameters;

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
     * <p>The ID of the region in which the stack is deployed. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable the replacement update feature. If you cannot change resource properties, you can enable the replacement update feature to replace the resource properties. If the replacement update feature is used, the existing resource is deleted and a new resource is created. The physical ID of the new resource is different from the physical ID of the deleted resource.</p>
     * <br>
     * <p>Default value: Disabled. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled</p>
     * <br>
     * <p>>  Changes have higher priorities than replacement updates.</p>
     */
    @NameInMap("ReplacementOption")
    public String replacementOption;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The structure that contains the stack policy body. The policy body must be 1 to 16,384 bytes in length.</p>
     * <br>
     * <p>>  You can specify only one of the StackPolicyBody and StackPolicyURL parameters.</p>
     */
    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    /**
     * <p>The structure that contains the body of the temporary overriding stack policy. The policy body must be 1 to 16,384 bytes in length.</p>
     * <br>
     * <p>If you want to update protected resources, you must specify a temporary overriding stack policy during the update. If you do not specify a temporary overriding stack policy, the existing policy that is associated with the stack is used.</p>
     * <br>
     * <p>This parameter takes effect only when the ChangeSetType parameter is set to UPDATE. You can specify only one of the following parameters:</p>
     * <br>
     * <p>*   StackPolicyBody</p>
     * <p>*   StackPolicyURL</p>
     * <p>*   StackPolicyDuringUpdateBody</p>
     * <p>*   StackPolicyDuringUpdateURL</p>
     */
    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    /**
     * <p>The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
     * <br>
     * <p>>  If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>The URL can be up to 1,350 bytes in length.</p>
     * <br>
     * <p>If you want to update protected resources, you must specify a temporary overriding stack policy during the update. If you do not specify a temporary overriding stack policy, the existing policy that is associated with the stack is used. This parameter takes effect only when the ChangeSetType parameter is set to UPDATE. You can specify only one of the following parameters:</p>
     * <br>
     * <p>*   StackPolicyBody</p>
     * <p>*   StackPolicyURL</p>
     * <p>*   StackPolicyDuringUpdateBody</p>
     * <p>*   StackPolicyDuringUpdateURL</p>
     */
    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    /**
     * <p>The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You can specify only one of the StackPolicyBody and StackPolicyURL parameters.</p>
     * <br>
     * <p>The URL can be up to 1,350 bytes in length.</p>
     */
    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    /**
     * <p>The value of tag N that you want to add to the template.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateStackRequestTags> tags;

    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared templates and private templates.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body must be 1 to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when the TemplateId parameter is specified.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The timeout period for the update operation on the stack.</p>
     * <br>
     * <p>*   Default value: 60.</p>
     * <p>*   Unit: minutes.</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    /**
     * <p>Specifies whether to use the values specified in the previous request for the parameters that you do not specify in the current request.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("UsePreviousParameters")
    public Boolean usePreviousParameters;

    public static UpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackRequest self = new UpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public UpdateStackRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateStackRequest setDryRunOptions(java.util.List<String> dryRunOptions) {
        this.dryRunOptions = dryRunOptions;
        return this;
    }
    public java.util.List<String> getDryRunOptions() {
        return this.dryRunOptions;
    }

    public UpdateStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public UpdateStackRequest setParameters(java.util.List<UpdateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public UpdateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackRequest setReplacementOption(String replacementOption) {
        this.replacementOption = replacementOption;
        return this;
    }
    public String getReplacementOption() {
        return this.replacementOption;
    }

    public UpdateStackRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public UpdateStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public UpdateStackRequest setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
        return this;
    }
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    public UpdateStackRequest setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
        return this;
    }
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    public UpdateStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public UpdateStackRequest setTags(java.util.List<UpdateStackRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateStackRequestTags> getTags() {
        return this.tags;
    }

    public UpdateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public UpdateStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public UpdateStackRequest setUsePreviousParameters(Boolean usePreviousParameters) {
        this.usePreviousParameters = usePreviousParameters;
        return this;
    }
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public static class UpdateStackRequestParameters extends TeaModel {
        /**
         * <p>The name of parameter N. If you do not specify the name and value of a parameter, ROS uses the default name and value in the template.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N. Maximum value of N: 200.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackRequestParameters self = new UpdateStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateStackRequestTags extends TeaModel {
        /**
         * <p>The key of tag N that you want to add to the stack.</p>
         * <br>
         * <p>Valid values of N: 1 to 20.</p>
         * <br>
         * <p>> - The Tags parameter is optional. If you specify Tags, you must specify Tags.N.Key.</p>
         * <p>> - The tag of a stack is propagated to each resource that supports the tag feature in the stack. For more information, see [Propagate tags](~~201421~~).</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that you want to add to the stack.</p>
         * <br>
         * <p>Valid values of N: 1 to 20.</p>
         * <br>
         * <p>>  The tag of a stack is propagated to each resource that supports the tag feature in the stack. For more information, see [Propagate tags](~~201421~~).</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateStackRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackRequestTags self = new UpdateStackRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateStackRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateStackRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
