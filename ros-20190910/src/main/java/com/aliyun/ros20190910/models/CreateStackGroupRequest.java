// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM role that you specify for the administrator account when you create a self-managed stack group. ROS assumes the administrator role to perform operations. If you do not specify this parameter, the default value AliyunROSStackGroupAdministrationRole is used. ROS uses the administrator role to assume the execution role AliyunROSStackGroupExecutionRole to perform operations on the stacks in the stack group.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    /**
     * <p>The information about automatic deployment settings.</p>
     * <br>
     * <p>>  This parameter is required only if the PermissionModel parameter is set to SERVICE_MANAGED.</p>
     */
    @NameInMap("AutoDeployment")
    public CreateStackGroupRequestAutoDeployment autoDeployment;

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
     * <p>The description of the stack group.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the RAM role that you specify for the execution account when you create a self-managed stack group. The administrator role AliyunROSStackGroupAdministrationRole assumes the execution role to perform operations. If you do not specify this parameter, the default value AliyunROSStackGroupExecutionRole is used. ROS assumes the execution role to perform operations on the stacks in the stack group.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    /**
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateStackGroupRequestParameters> parameters;

    /**
     * <p>The permission model.</p>
     * <br>
     * <p>Default value: SELF_MANAGED. Valid values:</p>
     * <br>
     * <p>*   SELF_MANAGED: the self-managed permission model. If you create a self-managed stack group, you must create RAM roles within the administrator and execution accounts and establish a trust relationship between the accounts. Then, you can deploy stacks within the execution account.</p>
     * <p>*   SERVICE_MANAGED: the service-managed permission model. If you create a service-managed stack group, ROS creates service-linked roles for the administrator and execution accounts, and the administrator account uses its role to deploy stacks within the execution account.</p>
     * <br>
     * <p>>  When you use the service-managed permission model to deploy stacks, make sure that your account is the management account or a delegated administrator account in the resource directory and the trusted access feature is enabled for your account. For more information, see [Step 1: (Optional) Create a delegated administrator account](~~308253~~) and [Step 2: Enable trusted access](~~298229~~).</p>
     */
    @NameInMap("PermissionModel")
    public String permissionModel;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If you do not specify this parameter, the stack group is added to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see the "Resource Group" section of the [What is Resource Management?](~~94475~~) topic.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the stack group. The name must be unique within a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("Tags")
    public java.util.List<CreateStackGroupRequestTags> tags;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body must be 1 to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <br>
     * <p>>  This parameter takes effect only when the TemplateId parameter is specified.</p>
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
         * <p>Specifies whether to enable automatic deployment.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: enables automatic deployment. If you add a member to the folder to which the stack group belongs after you enable automatic deployment, ROS automatically adds the stacks in the stack group to the member. If you remove a member from the folder, ROS automatically deletes the stacks from the member.</p>
         * <p>*   false: disables automatic deployment. After you disable automatic deployment, the stacks remain unchanged when you change the members in the folder.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to retain stacks within a member when you remove the member from the folder.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: retains the stacks.</p>
         * <p>*   false: deletes the stacks.</p>
         * <br>
         * <p>>  This parameter is required if the Enabled parameter is set to true.</p>
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
         * <p>The name of parameter N. If you do not specify the name and value of a parameter, ROS uses the default name and value that are defined in the template.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterKey parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterValue parameter.</p>
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
         * <p>The key of tag N that you want to add to the stack group.</p>
         * <br>
         * <p>>  The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that you want to add to the stack group.</p>
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
