// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetRequest extends TeaModel {
    /**
     * <p>The name of the change set.\
     * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or a letter.</p>
     * <blockquote>
     * <p>Make sure that the name is unique among all names of change sets that are associated with the specified stack.</p>
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
     * <li>CREATE: creates a change set for a new stack.</li>
     * <li>UPDATE (default): creates a change set for an existing stack.</li>
     * <li>IMPORT: creates a change set for a new stack or an existing stack to import resources that are not managed by ROS.</li>
     * </ul>
     * <p>If you set ChangeSetType to CREATE, ROS creates a stack. The stack remains in the <code>REVIEW_IN_PROGRESS</code> state until you execute the change set.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You cannot set ChangeSetType to UPDATE when you create a change set for a new stack. You cannot set ChangeSetType to CREATE when you create a change set for an existing stack.</p>
     * </li>
     * <li><p>If you set ChangeSetType to Import, you cannot configure a stack policy. You can specify ChangeSetType only when you create or update a stack.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UPDATE</p>
     */
    @NameInMap("ChangeSetType")
    public String changeSetType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.\
     * The token can contain letters, digits, hyphens (-), and underscores (_) and cannot exceed 64 characters in length.\
     * For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
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
     * <p>Specifies whether to disable rollback when the stack fails to be created.\
     * Valid values:</p>
     * <ul>
     * <li>true: disables rollback for the stack when the stack fails to be created.</li>
     * <li>false (default): enables rollback for the stack when the stack fails to be created.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The callback URLs that are used to receive stack events.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://my-site.com/ros-notify">http://my-site.com/ros-notify</a></p>
     */
    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    /**
     * <p>The maximum number of concurrent operations that can be performed on resources. By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0. If you set this parameter to a specific value, ROS associates the value with the stack. The value can affect subsequent operations on the stack.</p>
     * <p>This parameter takes effect only if you set ChangeSetType to CREATE or UPDATE.</p>
     * <ul>
     * <li><p>Valid values for change sets of the CREATE type:</p>
     * <ul>
     * <li>If you set this parameter to an integer that is greater than 0, the integer is used.</li>
     * <li>If you set this parameter to 0 or leave this parameter empty, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
     * </ul>
     * </li>
     * <li><p>Valid values for change sets of the UPDATE type:</p>
     * <ul>
     * <li>If you set this parameter to an integer that is greater than 0, the integer is used.</li>
     * <li>If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
     * <li>If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
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
     * <p>The name of the Resource Access Management (RAM) role. ROS assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.\
     * ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack, ROS assumes the RAM role even if you do not have permissions to use the RAM role. You must make sure that permissions are granted to the RAM role based on the principle of least privilege.\
     * If you do not specify this parameter, ROS assumes the existing role of the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.\
     * The RAM role name can be up to 64 characters in length.</p>
     * <p>For more information about RAM roles, see <a href="https://help.aliyun.com/document_detail/2568025.html">Use a stack role</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the change set.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable replacement update if a resource property is changed and you cannot modify the new resource property. For a change, the physical ID of the resource remains unchanged. For a replacement update, the existing resource is deleted, a new resource is created, and the physical ID of the resource is changed. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled (default)</li>
     * </ul>
     * <blockquote>
     * <p>Operations that you perform to modify the resource properties for an update take precedence over operations you perform to replace the resource properties for an update. This parameter takes effect only if you set ChangeSetType to UPDATE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("ReplacementOption")
    public String replacementOption;

    /**
     * <p>The resources that you want to import to the stack.</p>
     */
    @NameInMap("ResourcesToImport")
    public java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport;

    /**
     * <p>The ID of the stack for which you want to create the change set. ROS compares the stack information with the information that you submit, such as an updated template or parameter value, to generate the change set.\
     * You can call the <a href="https://help.aliyun.com/document_detail/610818.html">ListStacks</a> operation to query the stack ID.</p>
     * <blockquote>
     * <p> This parameter takes effect only when ChangeSetType is set to UPDATE or IMPORT.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The name of the stack for which you want to create the change set.\
     * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or a letter.</p>
     * <blockquote>
     * <p>This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyStack</p>
     */
    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The structure that contains the stack policy body. The policy body must be 1 to 16,384 bytes in length.</p>
     * <p>If you set ChangeSetType to <strong>CREATE</strong>, you can specify StackPolicyBody or StackPolicyURL.</p>
     * <p>If you set ChangeSetType to <strong>UPDATE</strong>, you can specify only one of the following parameters:</p>
     * <ul>
     * <li>StackPolicyBody</li>
     * <li>StackPolicyURL</li>
     * <li>StackPolicyDuringUpdateBody</li>
     * <li>StackPolicyDuringUpdateURL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:&quot;Update:<em>&quot;,&quot;Principal&quot;:&quot;</em>&quot;,&quot;Resource&quot;:&quot;*&quot;}]}</p>
     */
    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    /**
     * <p>The structure of the temporary overriding stack policy. The policy body must be 1 to 16,384 bytes in length.\
     * If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a temporary overriding stack policy, the existing stack policy that is associated with the stack is used.\
     * This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:</p>
     * <ul>
     * <li>StackPolicyBody</li>
     * <li>StackPolicyURL</li>
     * <li>StackPolicyDuringUpdateBody</li>
     * <li>StackPolicyDuringUpdateURL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:&quot;Update:<em>&quot;,&quot;Principal&quot;:&quot;</em>&quot;,&quot;Resource&quot;:&quot;*&quot;}]}</p>
     */
    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    /**
     * <p>The URL of the stack policy based on which the stack is updated. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
     * <blockquote>
     * <p>If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * </blockquote>
     * <p>The URL can be up to 1,350 bytes in length.\
     * If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a stack policy, the existing policy that is associated with the stack is used. This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:</p>
     * <ul>
     * <li>StackPolicyBody</li>
     * <li>StackPolicyURL</li>
     * <li>StackPolicyDuringUpdateBody</li>
     * <li>StackPolicyDuringUpdateURL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/stack-policy/demo</p>
     */
    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    /**
     * <p>The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
     * <p>The URL can be up to 1,350 bytes in length.</p>
     * <blockquote>
     * <p> If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * </blockquote>
     * <p>If you set ChangeSetType to <strong>CREATE</strong>, you can specify StackPolicyBody or StackPolicyURL.</p>
     * <p>If you set ChangeSetType to <strong>UPDATE</strong>, you can specify only one of the following parameters:</p>
     * <ul>
     * <li>StackPolicyBody</li>
     * <li>StackPolicyURL</li>
     * <li>StackPolicyDuringUpdateBody</li>
     * <li>StackPolicyDuringUpdateURL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/stack-policy/demo</p>
     */
    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared templates and private templates.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/610842.html">ListTemplates</a> operation to query the template ID.</p>
     * <blockquote>
     * <p> You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the resource scenario. In this example, this parameter specifies the ID of a resource management scenario.</p>
     * <p>This parameter takes effect only when ChangeSetType is set to IMPORT. TemplateScratchId is supported only when you import resources to create a new stack.</p>
     * <p>If you want to use a resource management scenario to import resources, you can specify only TemplateScratchId rather than configuring parameters related to templates.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/610832.html">ListTemplateScratches</a> operation to query the ID of the resource management scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
     * <blockquote>
     * <p>If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * </blockquote>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
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
     * <p>This parameter takes effect only if you specify TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The amount of time that can elapse before the stack enters the CREATE_FAILED or UPDATE_FAILED state.\
     * If you set ChangeSetType to CREATE, this parameter is required. If you set ChangeSetType to UPDATE, this parameter is optional.</p>
     * <ul>
     * <li>Unit: minutes.</li>
     * <li>Valid values: 10 to 1440.</li>
     * <li>Default value: 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    /**
     * <p>Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only if you set ChangeSetType to UPDATE or IMPORT.</p>
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
         * <p>The key of parameter N that is defined in the template. If you do not specify the key and value of a parameter, ROS uses the default name and value that are defined in the template. Maximum value of N: 200.</p>
         * <blockquote>
         * <p> Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N that is defined in the template. Maximum value of N: 200.</p>
         * <blockquote>
         * <p> Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.</p>
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
         * <p>The logical ID of resource N. The logical ID is the name of the resource defined in the template.</p>
         * <blockquote>
         * <p> This parameter takes effect only when ChangeSetType is set to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must specify ResourcesToImport.N.LogicalResourceId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The key-value mapping between strings. The key-value mapping is used to identify resource N that you want to import. The key-value mapping must be a JSON string.\
         * A key is an identifier property of a resource and a value is the property value. For example, the key of the ALIYUN::ECS::VPC resource is VpcId and the value is <code>vpc-2zevx9ios****</code>.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/172485.html">GetTemplateSummary</a> operation to query the identifier property of the resource.</p>
         * <blockquote>
         * <p> This parameter takes effect only when ChangeSetType is set to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must specify ResourcesToImport.N.ResourceIdentifier.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VpcId&quot;: &quot;vpc-2zevx9ios******&quot;}</p>
         */
        @NameInMap("ResourceIdentifier")
        public String resourceIdentifier;

        /**
         * <p>The type of resource N. The resource type must be the same as the resource type that is defined in the template.</p>
         * <blockquote>
         * <p> This parameter takes effect only when ChangeSetType is set to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must specify ResourcesToImport.N.ResourceType.</p>
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

}
