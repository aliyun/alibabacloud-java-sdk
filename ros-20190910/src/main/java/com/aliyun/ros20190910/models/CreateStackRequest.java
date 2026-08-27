// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackRequest extends TeaModel {
    /**
     * <p>Ensures request idempotency. Must be client-generated and globally unique. Maximum length: 64 characters. Can contain <strong>letters</strong>, <strong>digits</strong>,<strong>&#x20;hyphens (-)</strong>, an&#x64;<strong>&#x20;underscores (_)</strong>.</p>
     * <p><a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a></p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The post-creation behavior for the stack. Valid values:</p>
     * <ul>
     * <li><p>KeepStackOnCreationComplete (default): retains the stack and resources after creation. Counts toward the stack quota.</p>
     * </li>
     * <li><p>AbandonStackOnCreationComplete: deletes the stack but retains resources after creation. Does not count toward the stack quota. The stack is retained if creation fails.</p>
     * </li>
     * <li><p>AbandonStackOnCreationRollbackComplete: deletes the stack after a creation rollback. Does not count toward the stack quota. The stack is retained in other rollback scenarios.</p>
     * </li>
     * <li><p>ManuallyPay: requires manual payment for subscription resources during stack creation. Supported resource types: <code>ALIYUN::ECS::InstanceGroup</code>, <code>ALIYUN::RDS::DBInstance</code>, <code>ALIYUN::SLB::LoadBalancer</code>, <code>ALIYUN::VPC::EIP</code>, and <code>ALIYUN::VPC::VpnGateway</code>.</p>
     * </li>
     * <li><p>RetryOnNoStock: automatically retries resource creation on insufficient inventory. Supported resource type: <code>ALIYUN::RDS::DBInstance</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can specify only one of the following parameters: CreateOption or CreateOptions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>KeepStackOnCreationComplete</p>
     */
    @NameInMap("CreateOption")
    public String createOption;

    /**
     * <p>The creation options for the stack.</p>
     */
    @NameInMap("CreateOptions")
    public java.util.List<String> createOptions;

    /**
     * <p>Specifies whether to enable deletion protection on the stack. Valid values:</p>
     * <ul>
     * <li><p>Enabled: enables deletion protection.</p>
     * </li>
     * <li><p>Disabled (default): allows stack deletion via the ROS console or the DeleteStack API.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The deletion protection of a nested stack is the same as that of its root stack.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("DeletionProtection")
    public String deletionProtection;

    /**
     * <p>Specifies whether to disable rollback when stack creation fails.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: disables rollback.</p>
     * </li>
     * <li><p>false (default): enables rollback.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The callback URL for stack events. Valid values:</p>
     * <ul>
     * <li><p>HTTP POST URL. Maximum length: 1,024 bytes.</p>
     * </li>
     * <li><p>EventBridge receives stack status change notifications. View events in the <a href="https://eventbridge.console.aliyun.com">EventBridge console</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Supported regions: China (Hangzhou), China (Shanghai), China (Beijing), China (Hong Kong), and China (Zhangjiakou).</p>
     * </blockquote>
     * <p>Maximum value of N: 5. ROS sends notifications on stack status changes, except for IN_PROGRESS events. With rollback enabled, CREATE_ROLLBACK and ROLLBACK events replace CREATE_FAILED and UPDATE_FAILED notifications. Notifications always include Outputs. Example notification:</p>
     * <pre><code>{
     *    &quot;Outputs&quot;: [
     *        {
     *            &quot;Description&quot;: &quot;No description given&quot;,
     *            &quot;OutputKey&quot;: &quot;InstanceId&quot;,
     *            &quot;OutputValue&quot;: &quot;i-xxx&quot;
     *        }
     *    ],
     *    &quot;StackId&quot;: &quot;80bd6b6c-e888-4573-ae3b-93d29113****&quot;,
     *    &quot;StackName&quot;: &quot;test-notification-url&quot;,
     *    &quot;Status&quot;: &quot;CREATE_COMPLETE&quot;
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p><a href="http://my-site.com/ros-event">http://my-site.com/ros-event</a></p>
     */
    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    /**
     * <p>The maximum number of concurrent operations on resources.</p>
     * <p>Default: empty. Accepts integers greater than or equal to 0.</p>
     * <blockquote>
     * <ul>
     * <li><p>If greater than 0, the specified value is used. If 0 or empty, no limit applies to ROS stacks; Terraform stacks use the Terraform default (typically 10).</p>
     * </li>
     * <li><p>The specified value persists with the stack and affects subsequent operations such as updates.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>The parameters that are defined in the template.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateStackRequestParameters> parameters;

    /**
     * <p>The RAM role name. ROS assumes this role for all stack API calls, even when the user has direct permissions, ensuring least-privilege access. <a href="https://help.aliyun.com/document_detail/2568025.html">Use a stack role</a>.</p>
     * <p>If not specified, ROS uses the role associated with the stack, or a temporary credential from your account if no role exists.</p>
     * <p>Maximum length: 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>test-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the stack. Call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If not specified, the stack is added to the default resource group.</p>
     * <p><a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group</a></p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The stack name. Maximum length: 255 characters. Must start with a <strong>letter</strong> and can contain <strong>letters</strong>, <strong>digits</strong>, <strong>hyphens (-)</strong>, and <strong>underscores (_)</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStack</p>
     */
    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The stack policy body. Length: 1 to 16,384 bytes.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters: StackPolicyBody or StackPolicyURL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;Update:<em>&quot;, &quot;Resource&quot;: &quot;</em>&quot;, &quot;Effect&quot;: &quot;Allow&quot;, &quot;Principal&quot;: &quot;*&quot;}]}</p>
     */
    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    /**
     * <p>The URL of the stack policy file. Supports HTTP, HTTPS, and OSS URLs (for example, oss\://ros/stack-policy/demo or oss\://ros/stack-policy/demo?RegionId=cn-hangzhou). Maximum file size: 16,384 bytes. If no OSS region is specified, the RegionId value is used.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters: StackPolicyBody or StackPolicyURL.</p>
     * </blockquote>
     * <p>Maximum URL length: 1,350 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-stack-policy/demo</p>
     */
    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    /**
     * <p>The tags of the stack.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateStackRequestTags> tags;

    /**
     * <p>The template body. Length: <strong>1 to 524,288 bytes</strong>. Use <strong>HTTP POST</strong> with <strong>Body parameters</strong> for large content to avoid URL length limits.</p>
     * <blockquote>
     * <p>You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, or TemplateScratchId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared and private templates.</p>
     * <blockquote>
     * <p>You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, or TemplateScratchId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the resource scenario.</p>
     * <p>Call <a href="https://help.aliyun.com/document_detail/363050.html">ListTemplateScratches</a> to query resource scenario IDs.</p>
     * <blockquote>
     * <p>You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, or TemplateScratchId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ts-aa9c62feab844a6b****</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The region ID of the resource scenario. Default value: the value of RegionId.</p>
     * <p>Call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query available regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TemplateScratchRegionId")
    public String templateScratchRegionId;

    /**
     * <p>The URL of the template file. Supports HTTP, HTTPS, and OSS URLs (for example, oss\://ros/stack-policy/demo or oss\://ros/stack-policy/demo?RegionId=cn-hangzhou). Maximum template size: 524,288 bytes. If no OSS region is specified, the RegionId value is used.</p>
     * <blockquote>
     * <p>You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, or TemplateScratchId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when you specify TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The stack creation timeout. Unit: minutes.</p>
     * <ul>
     * <li><p>Default value: 60.</p>
     * </li>
     * <li><p>Valid values: 10 to 1440.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    public static CreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackRequest self = new CreateStackRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackRequest setCreateOption(String createOption) {
        this.createOption = createOption;
        return this;
    }
    public String getCreateOption() {
        return this.createOption;
    }

    public CreateStackRequest setCreateOptions(java.util.List<String> createOptions) {
        this.createOptions = createOptions;
        return this;
    }
    public java.util.List<String> getCreateOptions() {
        return this.createOptions;
    }

    public CreateStackRequest setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateStackRequest setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public CreateStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public CreateStackRequest setParameters(java.util.List<CreateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateStackRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public CreateStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public CreateStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public CreateStackRequest setTags(java.util.List<CreateStackRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateStackRequestTags> getTags() {
        return this.tags;
    }

    public CreateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateStackRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public CreateStackRequest setTemplateScratchRegionId(String templateScratchRegionId) {
        this.templateScratchRegionId = templateScratchRegionId;
        return this;
    }
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
    }

    public CreateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class CreateStackRequestParameters extends TeaModel {
        /**
         * <p>The name of parameter N defined in the template. If you do not specify the name and value of a parameter, ROS uses the default value in the template.</p>
         * <p>The maximum value of N is 200. The name must be 1 to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. The name cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p>Parameters is an optional parameter. To specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N defined in the template.</p>
         * <p>The maximum value of N is 200. The value must be 0 to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. The value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p>Parameters is an optional parameter. To specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateStackRequestParameters self = new CreateStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateStackRequestTags extends TeaModel {
        /**
         * <p>The key of tag N of the stack.</p>
         * <p>Valid values: 1 to 20.</p>
         * <blockquote>
         * <ul>
         * <li><p>Tags is an optional parameter. To specify Tags, you must specify Tags.N.Key.</p>
         * </li>
         * <li><p>Stack tags propagate to each resource that supports tagging. <a href="https://help.aliyun.com/document_detail/201421.html">Tag propagation</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the stack.</p>
         * <p>Valid values: 1 to 20.</p>
         * <blockquote>
         * <p>Stack tags propagate to taggable resources. <a href="https://help.aliyun.com/document_detail/201421.html">Tag propagation</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateStackRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateStackRequestTags self = new CreateStackRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateStackRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateStackRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
