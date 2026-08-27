// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the destination accounts in which to deploy stacks in self-managed permission mode. You can specify a maximum of 50 destination account IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;12****&quot;]</p>
     */
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    /**
     * <p>The name of the RAM administrator role that is assumed by ROS. This parameter is required when you create a stack group that has self-managed permissions. If you do not specify a value, \<code>AliyunROSStackGroupAdministrationRole\\</code> is used as the default value. ROS assumes this role to perform operations on the stacks in the stack group. ROS uses the credentials of this role to assume the execution role (\<code>AliyunROSStackGroupExecutionRole\\</code>).</p>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunROSStackGroupAdministrationRole</p>
     */
    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    /**
     * <p>The automatic deployment settings.</p>
     * <blockquote>
     * <p>This parameter is required only when \<code>PermissionModel\\</code> is set to \<code>SERVICE_MANAGED\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Enabled&quot;: true, &quot;RetainStacksOnAccountRemoval&quot;: true}</p>
     */
    @NameInMap("AutoDeployment")
    public String autoDeploymentShrink;

    /**
     * <p>The options for the stack group. You can specify up to one option.</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<String> capabilities;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.<br>The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment options for a stack group with service-managed permissions. You can specify up to one deployment option.</p>
     */
    @NameInMap("DeploymentOptions")
    public java.util.List<String> deploymentOptions;

    /**
     * <p>The deployment targets to which you want to deploy stacks in service-managed permission mode.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RdFolderIds&quot;: [&quot;fd-4PvlVLOL8v&quot;]}</p>
     */
    @NameInMap("DeploymentTargets")
    public String deploymentTargetsShrink;

    /**
     * <p>The description of the stack group.</p>
     * <p>The description must be 1 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>My Stack Group</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the RAM execution role that is assumed by the administrator role (\<code>AliyunROSStackGroupAdministrationRole\\</code>). This parameter is required when you create a stack group that has self-managed permissions. If you do not specify a value, \<code>AliyunROSStackGroupExecutionRole\\</code> is used as the default value. ROS assumes this role to perform operations on the stacks in the stack group.</p>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunROSStackGroupExecutionRole</p>
     */
    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    /**
     * <p>The description of the operation to update the stack group.</p>
     * 
     * <strong>example:</strong>
     * <p>Update stack instances in hangzhou</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preferences for the stack group operation.</p>
     * <p>The following parameters are included:</p>
     * <ul>
     * <li><p>FailureToleranceCount</p>
     * <p>The number of accounts in each region where stack operation failures are allowed. If the number of failed operations in a region exceeds this value, Resource Orchestration Service (ROS) stops the operations in that region. If the operation is stopped in one region, the operation is not initiated in other regions.</p>
     * <p>The value must be an integer from 0 to 20.</p>
     * <p>If you do not specify this parameter, 0 is used as the default value.</p>
     * </li>
     * <li><p>FailureTolerancePercentage</p>
     * <p>The percentage of accounts in each region where stack operation failures are allowed. If the percentage of failed operations in a region exceeds this value, ROS stops the operations in that region.</p>
     * <p>The value must be an integer from 0 to 100. If the percentage is not an integer, ROS rounds down the percentage to the nearest integer.</p>
     * <p>If you do not specify this parameter, 0 is used as the default value.</p>
     * </li>
     * <li><p>MaxConcurrentCount</p>
     * <p>The maximum number of accounts in each region where stacks are deployed at the same time.</p>
     * <p>The value must be an integer from 1 to 20.</p>
     * <p>If you do not specify this parameter, 1 is used as the default value.</p>
     * </li>
     * <li><p>MaxConcurrentPercentage</p>
     * <p>The maximum percentage of accounts in each region where stacks are deployed at the same time.</p>
     * <p>The value must be an integer from 1 to 100. If the percentage is not an integer, ROS rounds down the percentage to the nearest integer.</p>
     * <p>If you do not specify this parameter, 1 is used as the default value.</p>
     * </li>
     * <li><p>RegionConcurrencyType
     * The concurrency type of deployment regions. Valid values:</p>
     * <ul>
     * <li><p>SEQUENTIAL (default): Deploys stacks in the specified regions sequentially. At any given time, stacks are deployed in only one region.</p>
     * </li>
     * <li><p>PARALLEL: Deploys stacks in all the specified regions in parallel.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>Separate multiple parameters with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>You can specify only one of \<code>MaxConcurrentCount\\</code> and \<code>MaxConcurrentPercentage\\</code>.</p>
     * </li>
     * <li><p>You can specify only one of \<code>FailureToleranceCount\\</code> and \<code>FailureTolerancePercentage\\</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FailureToleranceCount&quot;: 1,&quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    /**
     * <p>The parameters of the stack group.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateStackGroupShrinkRequestParameters> parameters;

    /**
     * <p>The permission model.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>SELF_MANAGED (default): Self-managed permissions. If you use this permission model, you must create RAM roles in the administrator and member accounts so that the accounts can be associated with each other. Then, you can deploy stacks in the member accounts.</p>
     * </li>
     * <li><p>SERVICE_MANAGED: Service-managed permissions. If you use this permission model, ROS creates service-linked roles for the administrator and member accounts. The administrator account uses the service-linked roles to deploy stacks in the member accounts.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If stack instances exist in the stack group, you cannot change the permission model.</p>
     * </li>
     * <li><p>If you use the service-managed permission model to deploy stacks, the current account must be the management account or a delegated administrator account of your resource directory, and trusted access must be enabled for the account. For more information, see <a href="https://help.aliyun.com/document_detail/308253.html">Set a delegated administrator account</a> and <a href="https://help.aliyun.com/document_detail/298229.html">Enable trusted access</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELF_MANAGED</p>
     */
    @NameInMap("PermissionModel")
    public String permissionModel;

    /**
     * <p>The ID of the region where the stack group is located. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions where you want to deploy the stacks. You can specify a maximum of 20 region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;, &quot;cn-beijing&quot;]</p>
     */
    @NameInMap("RegionIds")
    public String regionIdsShrink;

    /**
     * <p>The name of the stack group. The name must be unique within a region.<br>The name can be up to 255 characters in length and must start with a digit or a letter. The name can contain digits, letters, hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is large, pass the parameter in the request body using the HTTP POST and Body Param method to prevent request failures caused by an excessively long URL.</p>
     * <blockquote>
     * <p>You can specify only one of the \<code>TemplateBody\\</code>, \<code>TemplateURL\\</code>, and \<code>TemplateId\\</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared templates and private templates.</p>
     * <blockquote>
     * <p>You can specify only one of the \<code>TemplateBody\\</code>, \<code>TemplateURL\\</code>, and \<code>TemplateId\\</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. For example, the URL of an OSS bucket can be oss\://ros/template/demo or oss\://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region of the OSS bucket, the value of the \<code>RegionId\\</code> parameter is used.</p>
     * <blockquote>
     * <p>You can specify only one of the \<code>TemplateBody\\</code>, \<code>TemplateURL\\</code>, and \<code>TemplateId\\</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <blockquote>
     * <p>\<code>TemplateVersion\\</code> takes effect only when \<code>TemplateId\\</code> is specified.</p>
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

    public UpdateStackGroupShrinkRequest setDeploymentOptions(java.util.List<String> deploymentOptions) {
        this.deploymentOptions = deploymentOptions;
        return this;
    }
    public java.util.List<String> getDeploymentOptions() {
        return this.deploymentOptions;
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
         * <p>The key of the parameter. If you do not specify the key and value of a parameter, ROS uses the default name and value that are specified in the template.</p>
         * <p>You can specify a maximum of 200 parameters.</p>
         * <blockquote>
         * <p>The \<code>Parameters\\</code> parameter is optional. If you specify \<code>Parameters\\</code>, you must specify \<code>Parameters.N.ParameterKey\\</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         * <p>You can specify a maximum of 200 parameters.</p>
         * <blockquote>
         * <p>The \<code>Parameters\\</code> parameter is optional. If you specify \<code>Parameters\\</code>, you must specify \<code>Parameters.N.ParameterValue\\</code>.</p>
         * </blockquote>
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
