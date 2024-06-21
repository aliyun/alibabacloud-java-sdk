// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupShrinkRequest extends TeaModel {
    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <blockquote>
     * <p> You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;12****&quot;]</p>
     */
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    /**
     * <p>The key of parameter N. If you do not specify the key and value of the parameter, ROS uses the default key and value in the template.</p>
     * <p>Maximum value of N: 200.</p>
     * <blockquote>
     * <p> The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterKey parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AliyunROSStackGroupAdministrationRole</p>
     */
    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    /**
     * <p>The IDs of the folders in the resource directory. You can specify up to five folder IDs.</p>
     * <p>You can create stacks within all members in the specified folders. If you create stacks in the Root folder, the stacks are created within all members in the resource directory.</p>
     * <blockquote>
     * <p> To view the folder IDs, go to the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information of a folder</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Enabled&quot;: true, &quot;RetainStacksOnAccountRemoval&quot;: true}</p>
     */
    @NameInMap("AutoDeployment")
    public String autoDeploymentShrink;

    /**
     * <p>The option for the stack group. You can specify up to one option.</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<String> capabilities;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <blockquote>
     * <p> You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RdFolderIds&quot;: [&quot;fd-4PvlVLOL8v&quot;]}</p>
     */
    @NameInMap("DeploymentTargets")
    public String deploymentTargetsShrink;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <blockquote>
     * <p> You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>My Stack Group</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The value of parameter N.</p>
     * <p>Maximum value of N: 200.</p>
     * <blockquote>
     * <p> The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterValue parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AliyunROSStackGroupExecutionRole</p>
     */
    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    /**
     * <p>The version of the template. If you do not specify a version, the latest version is used.</p>
     * <blockquote>
     * <p> This parameter takes effect only if the TemplateId parameter is set.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Update stack instances in hangzhou</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The list of parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FailureToleranceCount&quot;: 1,&quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    /**
     * <p>Specifies whether to enable automatic deployment.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables automatic deployment. If you add a member to the folder to which the stack group belongs after you enable automatic deployment, the stack group deploys its stack instances within the member. If you remove a member from the folder, the stack group deletes stack instances that are deployed within the member.</li>
     * <li>false: disables automatic deployment. After you disable automatic deployment, the stack instances remain unchanged even if members in the folder change.</li>
     * </ul>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateStackGroupShrinkRequestParameters> parameters;

    /**
     * <p>The folder IDs in the resource directory. You can specify a maximum of five folder IDs.</p>
     * <p>You must set at least one of the RdFolderIds and AccountIds parameters. The parameters are subject to the following items:</p>
     * <ul>
     * <li>If you set only the RdFolderIds parameter, stacks are deployed within all the members in the specified folders. If you specify the Root folder, ROS deploys the stacks within all the members in the resource directory.</li>
     * <li>If you set only the AccountIds parameter, stacks are deployed within the specified members.</li>
     * <li>If you set both parameters, the accounts specified by AccountIds must be contained in the folders specified by RdFolderIds.</li>
     * </ul>
     * <blockquote>
     * <p> To view the folder IDs, go to the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information of a folder</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELF_MANAGED</p>
     */
    @NameInMap("PermissionModel")
    public String permissionModel;

    /**
     * <p>The region IDs of stack instances. You can specify a maximum of 20 region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the operation to update the stack group.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;, &quot;cn-beijing&quot;]</p>
     */
    @NameInMap("RegionIds")
    public String regionIdsShrink;

    /**
     * <p>The region IDs of stack instances. You can specify a maximum of 20 region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The permission model.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SELF_MANAGED: the self-managed permission model. This is the default value. If you use the self-managed model for the stack group, you must create RAM roles for the administrator and execution accounts, and establish a trust relationship between the accounts to deploy stacks within the execution account.</li>
     * <li>SERVICE_MANAGED: the service-managed permission model. If you use the service-managed model for the stack group, ROS creates service-linked roles for the administrator and execution accounts, and the administrator account uses its role to deploy stacks within the execution account.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If stack instances have been created in the stack group, you cannot switch the permission mode of the stack group.</li>
     * <li>If you want to use the service-managed permission model to deploy stacks, your account must be the management account or a delegated administrator account of your resource directory and the trusted access feature is enabled for the account. For more information, see <a href="https://help.aliyun.com/document_detail/308253.html">Step 1: (Optional) Create a delegated administrator account</a> and <a href="https://help.aliyun.com/document_detail/298229.html">Step 2: Enable trusted access</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the RAM role to be assumed by the administrator role AliyunROSStackGroupAdministrationRole. This parameter is required if you want to grant self-managed permissions to the stack group. If you do not specify a value for this parameter, the default value AliyunROSStackGroupExecutionRole is used. You can use this role in ROS to perform operations on the stacks that correspond to stack instances in the stack group.</p>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The information about automatic deployment settings.</p>
     * <blockquote>
     * <p> This parameter is required only if the PermissionModel parameter is set to SERVICE_MANAGED.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static UpdateStackGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupShrinkRequest self = new UpdateStackGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public UpdateStackGroupShrinkRequest setAdministrationRoleName(String administrationRoleName) {
        this.administrationRoleName = administrationRoleName;
        return this;
    }
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    public UpdateStackGroupShrinkRequest setAutoDeploymentShrink(String autoDeploymentShrink) {
        this.autoDeploymentShrink = autoDeploymentShrink;
        return this;
    }
    public String getAutoDeploymentShrink() {
        return this.autoDeploymentShrink;
    }

    public UpdateStackGroupShrinkRequest setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public UpdateStackGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackGroupShrinkRequest setDeploymentTargetsShrink(String deploymentTargetsShrink) {
        this.deploymentTargetsShrink = deploymentTargetsShrink;
        return this;
    }
    public String getDeploymentTargetsShrink() {
        return this.deploymentTargetsShrink;
    }

    public UpdateStackGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStackGroupShrinkRequest setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    public UpdateStackGroupShrinkRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public UpdateStackGroupShrinkRequest setOperationPreferencesShrink(String operationPreferencesShrink) {
        this.operationPreferencesShrink = operationPreferencesShrink;
        return this;
    }
    public String getOperationPreferencesShrink() {
        return this.operationPreferencesShrink;
    }

    public UpdateStackGroupShrinkRequest setParameters(java.util.List<UpdateStackGroupShrinkRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackGroupShrinkRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateStackGroupShrinkRequest setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }
    public String getPermissionModel() {
        return this.permissionModel;
    }

    public UpdateStackGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackGroupShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public UpdateStackGroupShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackGroupShrinkRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackGroupShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackGroupShrinkRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackGroupShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class UpdateStackGroupShrinkRequestParameters extends TeaModel {
        /**
         * <p>Specifies whether to retain stacks in a member when you remove the member from the folder.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: retains the stacks.</li>
         * <li>false: deletes the stacks.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the Enabled parameter is set to true.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The folders in which you want to use service-managed permissions to update stacks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackGroupShrinkRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupShrinkRequestParameters self = new UpdateStackGroupShrinkRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupShrinkRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackGroupShrinkRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
