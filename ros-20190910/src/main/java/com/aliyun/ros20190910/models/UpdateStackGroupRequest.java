// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the accounts within which you want to use self-managed permissions to deploy stacks. You can specify a maximum of 20 account IDs.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The name of the RAM role to be assumed by the administrator account in ROS. This parameter is required if you want to grant self-managed permissions to the stack group. If you do not specify a value for this parameter, the default value AliyunROSStackGroupAdministrationRole is used. You can use the administrator role in ROS to assume the execution role AliyunROSStackGroupExecutionRole to perform operations on the stacks that correspond to stack instances in the stack group.</p>
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
    public UpdateStackGroupRequestAutoDeployment autoDeployment;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The folders in which you want to use service-managed permissions to update stacks.</p>
     */
    @NameInMap("DeploymentTargets")
    public UpdateStackGroupRequestDeploymentTargets deploymentTargets;

    /**
     * <p>The description of the stack group.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the RAM role to be assumed by the administrator role AliyunROSStackGroupAdministrationRole. This parameter is required if you want to grant self-managed permissions to the stack group. If you do not specify a value for this parameter, the default value AliyunROSStackGroupExecutionRole is used. You can use this role in ROS to perform operations on the stacks that correspond to stack instances in the stack group.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    /**
     * <p>The description of the operation to update the stack group.</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preferences of the operation to update the stack group.</p>
     * <br>
     * <p>The following parameters are available:</p>
     * <br>
     * <p>*   {"FailureToleranceCount": N}</p>
     * <br>
     * <p>    The maximum number of accounts within which stack operation failures are allowed in each region. If the value is exceeded in a region, ROS stops the operation in the region. If ROS stops the operation in one region, the operation is not performed in other regions.</p>
     * <br>
     * <p>    Valid values of N: 0 to 20.</p>
     * <br>
     * <p>    If you do not specify a value for the FailureToleranceCount parameter, the default value 0 is used.</p>
     * <br>
     * <p>*   {"FailureTolerancePercentage": N}</p>
     * <br>
     * <p>    The percentage of accounts within which stack operation failures are allowed in each region. If the value is exceeded in a region, ROS stops the operation in the region.</p>
     * <br>
     * <p>    Valid values of N: 0 to 100. If the number of accounts specified by the percentage is not a whole number, ROS rounds down the number.</p>
     * <br>
     * <p>    If you do not specify a value for the FailureTolerancePercentage parameter, the default value 0 is used.</p>
     * <br>
     * <p>*   {"MaxConcurrentCount": N}</p>
     * <br>
     * <p>    The maximum number of accounts within which stacks can be deployed at a time in each region.</p>
     * <br>
     * <p>    Valid values of N: 1 to 20.</p>
     * <br>
     * <p>    If you do not specify a value for the MaxConcurrentCount parameter, the default value 1 is used.</p>
     * <br>
     * <p>*   {"MaxConcurrentPercentage": N}</p>
     * <br>
     * <p>    The percentage of accounts within which stacks can be deployed at a time in each region.</p>
     * <br>
     * <p>    Valid values of N: 1 to 100. If the number of accounts specified by the percentage is not a whole number, ROS rounds down the number.</p>
     * <br>
     * <p>    If you do not specify a value for the MaxConcurrentPercentage parameter, the default value 1 is used.</p>
     * <br>
     * <p>*   {"RegionConcurrencyType": N}</p>
     * <br>
     * <p>    Specifies whether stacks can be deployed in multiple regions in parallel. Valid values:</p>
     * <br>
     * <p>    *   SEQUENTIAL: deploys stacks in the specified regions one by one in sequence. This way, stacks are deployed in only one region at a time. This is the default value.</p>
     * <p>    *   PARALLEL: deploys stacks in all the specified regions in parallel.</p>
     * <br>
     * <p>Separate multiple parameters with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   You can specify only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters.</p>
     * <p>*   You can specify only one of the FailureToleranceCount and FailureTolerancePercentage parameters.</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>The list of parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateStackGroupRequestParameters> parameters;

    /**
     * <p>The permission model.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   SELF_MANAGED: the self-managed permission model. This is the default value. If you use the self-managed model for the stack group, you must create RAM roles for the administrator and execution accounts, and establish a trust relationship between the accounts to deploy stacks within the execution account.</p>
     * <p>*   SERVICE_MANAGED: the service-managed permission model. If you use the service-managed model for the stack group, ROS creates service-linked roles for the administrator and execution accounts, and the administrator account uses its role to deploy stacks within the execution account.</p>
     * <br>
     * <p>> </p>
     * <p>*   If stack instances have been created in the stack group, you cannot switch the permission mode of the stack group.</p>
     * <p>*   If you want to use the service-managed permission model to deploy stacks, your account must be the management account or a delegated administrator account of your resource directory and the trusted access feature is enabled for the account. For more information, see [Step 1: (Optional) Create a delegated administrator account](~~308253~~) and [Step 2: Enable trusted access](~~298229~~).</p>
     */
    @NameInMap("PermissionModel")
    public String permissionModel;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](~~131035~~) operation to query the latest list of Alibaba Cloud regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The region IDs of stack instances. You can specify a maximum of 20 region IDs.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The name of the stack group. The name must be unique within a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>>  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>>  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify a version, the latest version is used.</p>
     * <br>
     * <p>>  This parameter takes effect only if the TemplateId parameter is set.</p>
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
         * <p>Specifies whether to enable automatic deployment.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: enables automatic deployment. If you add a member to the folder to which the stack group belongs after you enable automatic deployment, the stack group deploys its stack instances within the member. If you remove a member from the folder, the stack group deletes stack instances that are deployed within the member.</p>
         * <p>*   false: disables automatic deployment. After you disable automatic deployment, the stack instances remain unchanged even if members in the folder change.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

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
         * <p>The IDs of the members in the resource directory. You can specify a maximum of 20 member IDs.</p>
         * <br>
         * <p>>  To view the member IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the detailed information of a member](~~111624~~).</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

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
         * <p>The key of parameter N. If you do not specify the key and value of the parameter, ROS uses the default key and value in the template.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterKey parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterValue parameter.</p>
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
