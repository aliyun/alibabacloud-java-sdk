// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackGroupRequest extends TeaModel {
    /**
     * <p>The RAM role for the administrator account in a self-managed stack group. ROS assumes this role to perform operations. Default: AliyunROSStackGroupAdministrationRole.</p>
     * <p>1 to 64 characters. Can contain letters, digits, and hyphens (-).</p>
     * <blockquote>
     * <p>This parameter is required when PermissionModel is set to SELF_MANAGED.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AliyunROSStackGroupAdministrationRole</p>
     */
    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    /**
     * <p>The automatic deployment settings.</p>
     * <blockquote>
     * <p>You must specify this parameter if PermissionModel is set to SERVICE_MANAGED.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Enabled&quot;: true, &quot;RetainStacksOnAccountRemoval&quot;: true}</p>
     */
    @NameInMap("AutoDeployment")
    public CreateStackGroupRequestAutoDeployment autoDeployment;

    /**
     * <p>The options for the stack group. Maximum: one option.</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<String> capabilities;

    /**
     * <p>The client token for idempotency. Must be unique across requests. Can contain letters, digits, underscores (_), and hyphens (-), up to 64 characters. <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The stack group description. 1 to 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>StackGroup Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The RAM role for the execution account in a self-managed stack group. The administrator role assumes this role to perform stack operations. Default: AliyunROSStackGroupExecutionRole.</p>
     * <p>1 to 64 characters. Can contain letters, digits, and hyphens (-).</p>
     * <blockquote>
     * <p>This parameter is required when PermissionModel is set to SELF_MANAGED.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AliyunROSStackGroupExecutionRole</p>
     */
    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    /**
     * <p>The parameters of the stack group.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateStackGroupRequestParameters> parameters;

    /**
     * <p>The permission model of the stack group.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>SELF_MANAGED (default): Create RAM roles for the administrator and execution accounts and establish a trust relationship between them.</p>
     * </li>
     * <li><p>SERVICE_MANAGED: ROS automatically creates service-linked roles for the administrator and execution accounts.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To use SERVICE_MANAGED, your account must be the management account or a delegated administrator account of a resource directory with trusted access enabled. <a href="https://help.aliyun.com/document_detail/308253.html">Manage a delegated administrator account</a> and <a href="https://help.aliyun.com/document_detail/298229.html">Enable trusted access</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELF_MANAGED</p>
     */
    @NameInMap("PermissionModel")
    public String permissionModel;

    /**
     * <p>The region ID of the stack group. Call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. Defaults to the default resource group. <a href="https://help.aliyun.com/document_detail/94475.html">Resource groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The stack ARN in the format acs:ros:${RegionId}:${AccountId}:stack/${StackId}. The stack group uses the template and parameters of this stack.</p>
     * <blockquote>
     * <ul>
     * <li><p>Only supported in self-managed permission mode.</p>
     * </li>
     * <li><p>If StackArn is specified, Parameters must not be specified.</p>
     * </li>
     * <li><p>You must specify <strong>only one</strong> of TemplateBody, TemplateURL, TemplateId, or StackArn.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ros:cn-hangzhou:175458000000****:stack/4a65f506-c3cc-43b6-af06-3f000000****</p>
     */
    @NameInMap("StackArn")
    public String stackArn;

    /**
     * <p>The stack group name. Must be unique within a region. 1 to 255 characters. Can contain letters, digits, hyphens (-), and underscores (_). Must start with a letter or digit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The tags of the stack group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateStackGroupRequestTags> tags;

    /**
     * <p>The template body. 1 to 524,288 bytes. For large templates, pass the body in the HTTP POST request body to avoid URL length limits.</p>
     * <blockquote>
     * <p>Specify exactly one of TemplateBody, TemplateURL, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. Applies to shared and private templates.</p>
     * <blockquote>
     * <p>Specify exactly one of TemplateBody, TemplateURL, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the template file. Supports HTTP, HTTPS, and OSS URLs. 1 to 524,288 bytes. Examples: oss\://ros/template/demo, oss\://ros/template/demo?RegionId=cn-hangzhou. If no region ID is specified for the OSS bucket, the RegionId value applies.</p>
     * <blockquote>
     * <p>Specify exactly one of TemplateBody, TemplateURL, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The template version. Defaults to the latest version.</p>
     * <blockquote>
     * <p>TemplateVersion takes effect only if you specify TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static CreateStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackGroupRequest self = new CreateStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackGroupRequest setAdministrationRoleName(String administrationRoleName) {
        this.administrationRoleName = administrationRoleName;
        return this;
    }
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    public CreateStackGroupRequest setAutoDeployment(CreateStackGroupRequestAutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
        return this;
    }
    public CreateStackGroupRequestAutoDeployment getAutoDeployment() {
        return this.autoDeployment;
    }

    public CreateStackGroupRequest setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public CreateStackGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStackGroupRequest setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    public CreateStackGroupRequest setParameters(java.util.List<CreateStackGroupRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateStackGroupRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateStackGroupRequest setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }
    public String getPermissionModel() {
        return this.permissionModel;
    }

    public CreateStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateStackGroupRequest setStackArn(String stackArn) {
        this.stackArn = stackArn;
        return this;
    }
    public String getStackArn() {
        return this.stackArn;
    }

    public CreateStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public CreateStackGroupRequest setTags(java.util.List<CreateStackGroupRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateStackGroupRequestTags> getTags() {
        return this.tags;
    }

    public CreateStackGroupRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateStackGroupRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateStackGroupRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateStackGroupRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class CreateStackGroupRequestAutoDeployment extends TeaModel {
        /**
         * <p>Whether automatic deployment is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: ROS automatically creates stacks for new member accounts added to the folder and deletes stacks for removed accounts.</p>
         * </li>
         * <li><p>false: Stacks remain unchanged when member accounts are added to or removed from the folder.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Whether to retain stacks when a member account is removed from the folder.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify RetainStacksOnAccountRemoval if Enabled is true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RetainStacksOnAccountRemoval")
        public Boolean retainStacksOnAccountRemoval;

        public static CreateStackGroupRequestAutoDeployment build(java.util.Map<String, ?> map) throws Exception {
            CreateStackGroupRequestAutoDeployment self = new CreateStackGroupRequestAutoDeployment();
            return TeaModel.build(map, self);
        }

        public CreateStackGroupRequestAutoDeployment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateStackGroupRequestAutoDeployment setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

    }

    public static class CreateStackGroupRequestParameters extends TeaModel {
        /**
         * <p>The key of parameter N. If not specified, ROS uses the default name and value defined in the template.</p>
         * <p>Maximum value of N: 200.</p>
         * <blockquote>
         * <p>Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N.</p>
         * <p>Maximum value of N: 200.</p>
         * <blockquote>
         * <p>Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateStackGroupRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateStackGroupRequestParameters self = new CreateStackGroupRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateStackGroupRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateStackGroupRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateStackGroupRequestTags extends TeaModel {
        /**
         * <p>The tag key of the stack group.</p>
         * <blockquote>
         * <p>Tags is optional. If you want to specify Tags, you must also specify Tags.N.Key.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateStackGroupRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateStackGroupRequestTags self = new CreateStackGroupRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateStackGroupRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateStackGroupRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
