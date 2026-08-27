// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetRequest extends TeaModel {
    /**
     * <p>The change set name. Maximum length: 255 characters. The name can contain digits, letters, hyphens (-), and underscores (_), and must start with a digit or letter.</p>
     * <blockquote>
     * <p>The name of the change set must be unique within the stack.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChangeSet</p>
     */
    @NameInMap("ChangeSetName")
    public String changeSetName;

    /**
     * <p>The type of the change set. Valid values:</p>
     * <ul>
     * <li><p>CREATE: creates a change set for a new stack.</p>
     * </li>
     * <li><p>UPDATE (default): creates a change set for an existing stack.</p>
     * </li>
     * <li><p>IMPORT: creates a change set for a new stack or an existing stack to import resources that are not managed by ROS.</p>
     * </li>
     * </ul>
     * <p>If you set the value of ChangeSetType to CREATE, ROS creates a new stack. The stack is in the <code>REVIEW_IN_PROGRESS</code> state until you execute the change set.</p>
     * <blockquote>
     * <ul>
     * <li><p>You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.</p>
     * </li>
     * <li><p>You cannot set a stack policy for a change set of the IMPORT type. You can set a stack policy when you create or update a stack.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>UPDATE</p>
     */
    @NameInMap("ChangeSetType")
    public String changeSetType;

    /**
     * <p>The client token used to ensure request idempotence. The token must be unique across requests and can be up to 64 characters in length, containing letters, digits, hyphens (-), and underscores (_). <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the change set. The description can be up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>It is a demo.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to disable rollback on stack creation failure. Valid values:</p>
     * <ul>
     * <li><p>true: disables rollback on creation failure.</p>
     * </li>
     * <li><p>false (default): enables rollback on creation failure.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The list of webhook addresses for receiving stack event notifications.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://my-site.com/ros-notify">http://my-site.com/ros-notify</a></p>
     */
    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    /**
     * <p>The maximum number of concurrent resource operations. By default, this value is empty. Once set, the value is associated with the stack and affects subsequent operations.</p>
     * <p>This parameter takes effect only when ChangeSetType is set to CREATE or UPDATE. Valid values:</p>
     * <ul>
     * <li><p>If ChangeSetType is set to CREATE</p>
     * <ul>
     * <li><p>If you set this parameter to an integer that is greater than 0, the integer is used.</p>
     * </li>
     * <li><p>If you set this parameter to 0 or do not set this parameter, no limit is imposed on ROS stacks. For Terraform stacks, the default value of Terraform is used, which is 10.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If ChangeSetType is set to UPDATE</p>
     * <ul>
     * <li><p>If you set this parameter to an integer that is greater than 0, the integer is used.</p>
     * </li>
     * <li><p>If you set this parameter to 0, no limit is imposed on ROS stacks. For Terraform stacks, the default value of Terraform is used, which is 10.</p>
     * </li>
     * <li><p>If you do not set this parameter, the value that you specified in the previous operation is used. If you did not set this parameter in the previous operation, no limit is imposed on ROS stacks. For Terraform stacks, the default value of Terraform is used, which is 10.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
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
    public java.util.List<CreateChangeSetRequestParameters> parameters;

    /**
     * <p>The RAM role name. ROS assumes this role to call Alibaba Cloud service APIs and always uses it for all stack operations. If you lack the required permissions, ROS assumes the role specified by RamRoleName. If unspecified, ROS uses the existing stack role. If no role is available, ROS uses a temporary credential from your account. Maximum length: 64 bytes.</p>
     * <p><a href="https://help.aliyun.com/document_detail/2568025.html">Stack roles</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the change set.</p>
     * <p>Call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable replacement update when a resource property change does not support modification updates. A replacement update deletes the existing resource and creates a new one with a new physical ID. Valid values:</p>
     * <ul>
     * <li><p>Enabled: enables replacement update.</p>
     * </li>
     * <li><p>Disabled (default): disables replacement update.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Modification updates are preferentially used. This parameter takes effect only when ChangeSetType is set to UPDATE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("ReplacementOption")
    public String replacementOption;

    /**
     * <p>The resource group ID. If unspecified, the stack is added to the default resource group. <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resources to be imported.</p>
     */
    @NameInMap("ResourcesToImport")
    public java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport;

    /**
     * <p>The stack ID. ROS compares the stack information with the submitted changes, such as a modified template or different parameter values, to generate the change set. Call <a href="https://help.aliyun.com/document_detail/610818.html">ListStacks</a> to query stack IDs.</p>
     * <blockquote>
     * <p>This parameter takes effect only when ChangeSetType is set to UPDATE or IMPORT.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The stack name. Maximum length: 255 characters. The name can contain digits, letters, hyphens (-), and underscores (_), and must start with a digit or letter.</p>
     * <blockquote>
     * <p>This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyStack</p>
     */
    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The structure of the stack policy. The policy body must be 1 to 16,384 bytes in length.</p>
     * <p>When ChangeSetType is set to <strong>CREATE</strong>, you can specify only one of the StackPolicyBody and StackPolicyURL parameters.</p>
     * <p>When ChangeSetType is set to <strong>UPDATE</strong>, you can specify only one of the following parameters:</p>
     * <ul>
     * <li><p>StackPolicyBody</p>
     * </li>
     * <li><p>StackPolicyURL</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateBody</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateURL</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:&quot;Update:<em>&quot;,&quot;Principal&quot;:&quot;</em>&quot;,&quot;Resource&quot;:&quot;*&quot;}]}</p>
     */
    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    /**
     * <p>The temporary overriding stack policy body. Length: 1 to 16,384 bytes. To update protected resources, specify a temporary overriding policy. If unspecified, the current stack policy applies. This parameter takes effect only when ChangeSetType is set to UPDATE. You can specify only one of the following parameters:</p>
     * <ul>
     * <li><p>StackPolicyBody</p>
     * </li>
     * <li><p>StackPolicyURL</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateBody</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateURL</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:&quot;Update:<em>&quot;,&quot;Principal&quot;:&quot;</em>&quot;,&quot;Resource&quot;:&quot;*&quot;}]}</p>
     */
    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    /**
     * <p>The URL of the temporary overriding stack policy file. The URL must point to a policy on a web server (HTTP or HTTPS) or in an OSS bucket, such as oss\://ros/stack-policy/demo or oss\://ros/stack-policy/demo?RegionId=cn-hangzhou. Maximum policy file size: 16,384 bytes.</p>
     * <blockquote>
     * <p>If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * </blockquote>
     * <p>Maximum URL length: 1,350 bytes. To update protected resources, specify a temporary overriding stack policy. If unspecified, the current stack policy applies. This parameter takes effect only when ChangeSetType is set to UPDATE. You can specify only one of the following parameters:</p>
     * <ul>
     * <li><p>StackPolicyBody</p>
     * </li>
     * <li><p>StackPolicyURL</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateBody</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateURL</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/stack-policy/demo</p>
     */
    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    /**
     * <p>The URL of the stack policy file. The URL must point to a policy on a web server (HTTP or HTTPS) or in an OSS bucket, such as oss\://ros/stack-policy/demo or oss\://ros/stack-policy/demo?RegionId=cn-hangzhou. Maximum policy file size: 16,384 bytes.</p>
     * <p>Maximum URL length: 1,350 bytes.</p>
     * <blockquote>
     * <p>If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * </blockquote>
     * <p>When ChangeSetType is set to <strong>CREATE</strong>, you can specify only one of the StackPolicyBody and StackPolicyURL parameters.</p>
     * <p>When ChangeSetType is set to <strong>UPDATE</strong>, you can specify only one of the following parameters:</p>
     * <ul>
     * <li><p>StackPolicyBody</p>
     * </li>
     * <li><p>StackPolicyURL</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateBody</p>
     * </li>
     * <li><p>StackPolicyDuringUpdateURL</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/stack-policy/demo</p>
     */
    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    /**
     * <p>The tags of the change set.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateChangeSetRequestTags> tags;

    /**
     * <p>The list of resources to be marked as dirty.</p>
     */
    @NameInMap("TaintResources")
    public java.util.List<String> taintResources;

    /**
     * <p>The template body. Length: 1 to 524,288 bytes. For large templates, use HTTP POST with a body parameter to avoid URL length limits.</p>
     * <blockquote>
     * <p>You can specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared templates and private templates.</p>
     * <p>Call <a href="https://help.aliyun.com/document_detail/610842.html">ListTemplates</a> to query template IDs.</p>
     * <blockquote>
     * <p>You can specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The resource scenario ID, which is the resource management scenario ID.</p>
     * <p>This parameter takes effect only when ChangeSetType is set to IMPORT. This parameter supports only the creation of new stacks for resource import.</p>
     * <p>If you want to import resources in a resource management scenario, specify only this parameter. Do not specify parameters related to templates.</p>
     * <p>Call <a href="https://help.aliyun.com/document_detail/610832.html">ListTemplateScratches</a> to query scenario IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The URL of the template file. The URL must point to a template on a web server (HTTP or HTTPS) or in an OSS bucket, such as oss\://ros/template/demo or oss\://ros/template/demo?RegionId=cn-hangzhou. Maximum template body size: 524,288 bytes.</p>
     * <blockquote>
     * <p>If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * </blockquote>
     * <p>You can specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * <p>The URL can be up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template.</p>
     * <blockquote>
     * <p>This parameter takes effect only when TemplateId is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The timeout period before the stack enters CREATE_FAILED or UPDATE_FAILED state. Required when ChangeSetType is CREATE. Optional when ChangeSetType is UPDATE.</p>
     * <ul>
     * <li><p>Unit: minutes.</p>
     * </li>
     * <li><p>Valid values: 10 to 1440.</p>
     * </li>
     * <li><p>Default value: 60.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    /**
     * <p>Specifies whether to use the values of parameters that were last used. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when ChangeSetType is set to UPDATE or IMPORT.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UsePreviousParameters")
    public Boolean usePreviousParameters;

    public static CreateChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetRequest self = new CreateChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateChangeSetRequest setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public String getChangeSetName() {
        return this.changeSetName;
    }

    public CreateChangeSetRequest setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }
    public String getChangeSetType() {
        return this.changeSetType;
    }

    public CreateChangeSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateChangeSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateChangeSetRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateChangeSetRequest setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public CreateChangeSetRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public CreateChangeSetRequest setParameters(java.util.List<CreateChangeSetRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateChangeSetRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateChangeSetRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateChangeSetRequest setReplacementOption(String replacementOption) {
        this.replacementOption = replacementOption;
        return this;
    }
    public String getReplacementOption() {
        return this.replacementOption;
    }

    public CreateChangeSetRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateChangeSetRequest setResourcesToImport(java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport) {
        this.resourcesToImport = resourcesToImport;
        return this;
    }
    public java.util.List<CreateChangeSetRequestResourcesToImport> getResourcesToImport() {
        return this.resourcesToImport;
    }

    public CreateChangeSetRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateChangeSetRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public CreateChangeSetRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public CreateChangeSetRequest setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
        return this;
    }
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    public CreateChangeSetRequest setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
        return this;
    }
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    public CreateChangeSetRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public CreateChangeSetRequest setTags(java.util.List<CreateChangeSetRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateChangeSetRequestTags> getTags() {
        return this.tags;
    }

    public CreateChangeSetRequest setTaintResources(java.util.List<String> taintResources) {
        this.taintResources = taintResources;
        return this;
    }
    public java.util.List<String> getTaintResources() {
        return this.taintResources;
    }

    public CreateChangeSetRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateChangeSetRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateChangeSetRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public CreateChangeSetRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateChangeSetRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateChangeSetRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateChangeSetRequest setUsePreviousParameters(Boolean usePreviousParameters) {
        this.usePreviousParameters = usePreviousParameters;
        return this;
    }
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public static class CreateChangeSetRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter that is defined in the template. If you do not specify the name and value of a parameter, ROS uses the default name and value that are specified in the template. The value of N can be up to 200.</p>
         * <blockquote>
         * <p>The Parameters parameter is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter that is defined in the template. The value of N can be up to 200.</p>
         * <blockquote>
         * <p>The Parameters parameter is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateChangeSetRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestParameters self = new CreateChangeSetRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateChangeSetRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateChangeSetRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateChangeSetRequestResourcesToImport extends TeaModel {
        /**
         * <p>The logical ID of the resource. The logical ID is the resource name that is defined in the template.</p>
         * <blockquote>
         * <p>This parameter takes effect only when ChangeSetType is set to IMPORT. The ResourcesToImport parameter is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.LogicalResourceId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>A key-value mapping between strings. The value is a JSON string that is used to identify the resource to be imported. The key is the identifier property of the resource, such as the VpcId of an ALIYUN::ECS::VPC resource. The value is the value of the property, such as <code>vpc-2zevx9ios****</code>.</p>
         * <p>Call <a href="https://help.aliyun.com/document_detail/172485.html">GetTemplateSummary</a> to query resource identifier properties.</p>
         * <blockquote>
         * <p>This parameter takes effect only when ChangeSetType is set to IMPORT. The ResourcesToImport parameter is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.ResourceIdentifier.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VpcId&quot;: &quot;vpc-2zevx9ios******&quot;}</p>
         */
        @NameInMap("ResourceIdentifier")
        public String resourceIdentifier;

        /**
         * <p>The type of the resource. The resource type must be the same as the resource type that is defined in the template.</p>
         * <blockquote>
         * <p>This parameter takes effect only when ChangeSetType is set to IMPORT. The ResourcesToImport parameter is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.ResourceType.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateChangeSetRequestResourcesToImport build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestResourcesToImport self = new CreateChangeSetRequestResourcesToImport();
            return TeaModel.build(map, self);
        }

        public CreateChangeSetRequestResourcesToImport setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public CreateChangeSetRequestResourcesToImport setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public CreateChangeSetRequestResourcesToImport setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class CreateChangeSetRequestTags extends TeaModel {
        /**
         * <p>The tag key of the stack.</p>
         * <p>The value of N can be from 1 to 20.</p>
         * <blockquote>
         * <ul>
         * <li><p>The Tags parameter is optional. If you specify Tags, you must also specify Tags.N.Key.</p>
         * </li>
         * <li><p>The tag is propagated to each stack resource that supports tags. <a href="https://help.aliyun.com/document_detail/201421.html">Propagate tags</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the stack.</p>
         * <p>The value of N can be from 1 to 20.</p>
         * <blockquote>
         * <p>The tag is propagated to each stack resource that supports tags. For more information, see <a href="https://help.aliyun.com/document_detail/201421.html">Propagate tags</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateChangeSetRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestTags self = new CreateChangeSetRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateChangeSetRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateChangeSetRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
