// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupRequest extends TeaModel {
    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The key of parameter N. If you do not specify the key and value of the parameter, ROS uses the default key and value in the template.</p>
     * <br>
     * <p>Maximum value of N: 200.</p>
     * <br>
     * <p>>  The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterKey parameter.</p>
     */
    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    /**
     * <p>The IDs of the folders in the resource directory. You can specify up to five folder IDs.</p>
     * <br>
     * <p>You can create stacks within all members in the specified folders. If you create stacks in the Root folder, the stacks are created within all members in the resource directory.</p>
     * <br>
     * <p>>  To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information of a folder](~~111223~~).</p>
     */
    @NameInMap("AutoDeployment")
    public UpdateStackGroupRequestAutoDeployment autoDeployment;

    /**
     * <p>The option for the stack group. You can specify up to one option.</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<String> capabilities;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>>  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DeploymentTargets")
    public UpdateStackGroupRequestDeploymentTargets deploymentTargets;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>>  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The value of parameter N.</p>
     * <br>
     * <p>Maximum value of N: 200.</p>
     * <br>
     * <p>>  The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterValue parameter.</p>
     */
    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    /**
     * <p>The version of the template. If you do not specify a version, the latest version is used.</p>
     * <br>
     * <p>>  This parameter takes effect only if the TemplateId parameter is set.</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The list of parameters.</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>Specifies whether to enable automatic deployment.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: enables automatic deployment. If you add a member to the folder to which the stack group belongs after you enable automatic deployment, the stack group deploys its stack instances within the member. If you remove a member from the folder, the stack group deletes stack instances that are deployed within the member.</p>
     * <p>*   false: disables automatic deployment. After you disable automatic deployment, the stack instances remain unchanged even if members in the folder change.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateStackGroupRequestParameters> parameters;

    /**
     * <p>The folder IDs in the resource directory. You can specify a maximum of five folder IDs.</p>
     * <br>
     * <p>You must set at least one of the RdFolderIds and AccountIds parameters. The parameters are subject to the following items:</p>
     * <br>
     * <p>*   If you set only the RdFolderIds parameter, stacks are deployed within all the members in the specified folders. If you specify the Root folder, ROS deploys the stacks within all the members in the resource directory.</p>
     * <p>*   If you set only the AccountIds parameter, stacks are deployed within the specified members.</p>
     * <p>*   If you set both parameters, the accounts specified by AccountIds must be contained in the folders specified by RdFolderIds.</p>
     * <br>
     * <p>>  To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information of a folder](~~111223~~).</p>
     */
    @NameInMap("PermissionModel")
    public String permissionModel;

    /**
     * <p>The region IDs of stack instances. You can specify a maximum of 20 region IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the operation to update the stack group.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The region IDs of stack instances. You can specify a maximum of 20 region IDs.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The name of the RAM role to be assumed by the administrator account in ROS. This parameter is required if you want to grant self-managed permissions to the stack group. If you do not specify a value for this parameter, the default value AliyunROSStackGroupAdministrationRole is used. You can use the administrator role in ROS to assume the execution role AliyunROSStackGroupExecutionRole to perform operations on the stacks that correspond to stack instances in the stack group.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The permission model.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   SELF_MANAGED: the self-managed permission model. This is the default value. If you use the self-managed model for the stack group, you must create RAM roles for the administrator and execution accounts, and establish a trust relationship between the accounts to deploy stacks within the execution account.</p>
     * <p>*   SERVICE_MANAGED: the service-managed permission model. If you use the service-managed model for the stack group, ROS creates service-linked roles for the administrator and execution accounts, and the administrator account uses its role to deploy stacks within the execution account.</p>
     * <br>
     * <p>>- If stack instances have been created in the stack group, you cannot switch the permission mode of the stack group.</p>
     * <p>>- If you want to use the service-managed permission model to deploy stacks, your account must be the management account or a delegated administrator account of your resource directory and the trusted access feature is enabled for the account. For more information, see [Step 1: (Optional) Create a delegated administrator account](~~308253~~) and [Step 2: Enable trusted access](~~298229~~).</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the RAM role to be assumed by the administrator role AliyunROSStackGroupAdministrationRole. This parameter is required if you want to grant self-managed permissions to the stack group. If you do not specify a value for this parameter, the default value AliyunROSStackGroupExecutionRole is used. You can use this role in ROS to perform operations on the stacks that correspond to stack instances in the stack group.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The information about automatic deployment settings.</p>
     * <br>
     * <p>>  This parameter is required only if the PermissionModel parameter is set to SERVICE_MANAGED.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static UpdateStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupRequest self = new UpdateStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public UpdateStackGroupRequest setAdministrationRoleName(String administrationRoleName) {
        this.administrationRoleName = administrationRoleName;
        return this;
    }
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    public UpdateStackGroupRequest setAutoDeployment(UpdateStackGroupRequestAutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
        return this;
    }
    public UpdateStackGroupRequestAutoDeployment getAutoDeployment() {
        return this.autoDeployment;
    }

    public UpdateStackGroupRequest setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public UpdateStackGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackGroupRequest setDeploymentTargets(UpdateStackGroupRequestDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }
    public UpdateStackGroupRequestDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    public UpdateStackGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStackGroupRequest setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    public UpdateStackGroupRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public UpdateStackGroupRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public UpdateStackGroupRequest setParameters(java.util.List<UpdateStackGroupRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackGroupRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateStackGroupRequest setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }
    public String getPermissionModel() {
        return this.permissionModel;
    }

    public UpdateStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackGroupRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public UpdateStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackGroupRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackGroupRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackGroupRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackGroupRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class UpdateStackGroupRequestAutoDeployment extends TeaModel {
        /**
         * <p>The IDs of the members in the resource directory. You can specify a maximum of 20 member IDs.</p>
         * <br>
         * <p>>  To view the member IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the detailed information of a member](~~111624~~).</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The IDs of the members in the resource directory. You can specify a maximum of 20 member IDs.</p>
         * <br>
         * <p>>  To view the member IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the detailed information of a member](~~111624~~).</p>
         */
        @NameInMap("RetainStacksOnAccountRemoval")
        public Boolean retainStacksOnAccountRemoval;

        public static UpdateStackGroupRequestAutoDeployment build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupRequestAutoDeployment self = new UpdateStackGroupRequestAutoDeployment();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupRequestAutoDeployment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateStackGroupRequestAutoDeployment setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

    }

    public static class UpdateStackGroupRequestDeploymentTargets extends TeaModel {
        /**
         * <p>The list of one or more Alibaba Cloud accounts with which you want to share or unshare the template.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <p>The ID of the operation.</p>
         */
        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        public static UpdateStackGroupRequestDeploymentTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupRequestDeploymentTargets self = new UpdateStackGroupRequestDeploymentTargets();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupRequestDeploymentTargets setAccountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        public UpdateStackGroupRequestDeploymentTargets setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

    }

    public static class UpdateStackGroupRequestParameters extends TeaModel {
        /**
         * <p>Specifies whether to retain stacks in a member when you remove the member from the folder.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: retains the stacks.</p>
         * <p>*   false: deletes the stacks.</p>
         * <br>
         * <p>>  This parameter is required if the Enabled parameter is set to true.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The folders in which you want to use service-managed permissions to update stacks.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackGroupRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupRequestParameters self = new UpdateStackGroupRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackGroupRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
