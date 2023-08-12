// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM role that you specify for the administrator account when you create a self-managed stack group. ROS assumes the administrator role to perform operations. If you do not specify this parameter, AliyunROSStackGroupAdministrationRole is used as the default value. ROS uses the administrator role to assume the execution role AliyunROSStackGroupExecutionRole to perform operations on the stacks in the stack group.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    /**
     * <p>The information about automatic deployment settings.</p>
     * <br>
     * <p>> You must specify this parameter if PermissionModel is set to SERVICE_MANAGED.</p>
     */
    @NameInMap("AutoDeployment")
    public CreateStackGroupRequestAutoDeployment autoDeployment;

    /**
     * <p>资源栈组选项列表，最大长度为1。</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<String> capabilities;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\</p>
     * <p>The token can contain letters, digits, underscores (\_), and hyphens (-) and cannot exceed 64 characters in length.\</p>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the stack group.\</p>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the RAM role that you specify for the execution account when you create a self-managed stack group. The administrator role AliyunROSStackGroupAdministrationRole assumes the execution role to perform operations. If you do not specify this parameter, AliyunROSStackGroupExecutionRole is used as the default value. ROS assumes the execution role to perform operations on the stacks in the stack group.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, and hyphens (-).</p>
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
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   SELF_MANAGED (default): the self-managed permission model. If you create a self-managed stack group, you must create RAM roles within the administrator and execution accounts and establish a trust relationship between the accounts. Then, you can deploy stacks within the execution account.</p>
     * <p>*   SERVICE_MANAGED: the service-managed permission model. If you create a service-managed stack group, ROS creates service-linked roles for the administrator and execution accounts, and the administrator account uses its role to deploy stacks within the execution account.</p>
     * <br>
     * <p>> If you want to use the service-managed permission model to deploy stacks, your account must be the management account or a delegated administrator account of your resource directory and the trusted access feature is enabled for the account. For more information, see [Manage a delegated administrator account](~~308253~~) and [Enable trusted access](~~298229~~).</p>
     */
    @NameInMap("PermissionModel")
    public String permissionModel;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If you do not specify this parameter, the stack group is added to the default resource group.\</p>
     * <p>For more information about resource groups, see [Resource groups](~~94475~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the stack group. The name must be unique within a region.\</p>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or a letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The tags of the stack group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateStackGroupRequestTags> tags;

    /**
     * <p>The template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>> You must and can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>> You must and can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * <br>
     * <p>> You must and can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <br>
     * <p>> TemplateVersion takes effect only if you specify TemplateId.</p>
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
         * <p>Indicates whether automatic deployment is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: Automatic deployment is enabled. If you add a member account to the folder to which the stack group belongs after you enable automatic deployment, ROS automatically adds the stacks in the stack group to the member account. If you remove a member account from the folder, ROS automatically deletes the stacks from the member account.</p>
         * <p>*   false: Automatic deployment is disabled. After you disable automatic deployment, the stacks remain unchanged when you add member accounts to or remove member accounts from the folder.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether the stacks within a member account are retained when you remove the member account from the folder.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> You must specify RetainStacksOnAccountRemoval if Enabled is set to true.</p>
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
         * <p>The key of parameter N. If you do not specify the key and value of a parameter, ROS uses the default name and value that are defined in the template.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>> Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>> Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.</p>
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
         * <br>
         * <p>> Tags is optional. If you want to specify Tags, you must also specify Tags.N.Key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the stack group.</p>
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
