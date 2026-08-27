// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the stack group.</p>
     */
    @NameInMap("StackGroup")
    public GetStackGroupResponseBodyStackGroup stackGroup;

    public static GetStackGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupResponseBody self = new GetStackGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackGroupResponseBody setStackGroup(GetStackGroupResponseBodyStackGroup stackGroup) {
        this.stackGroup = stackGroup;
        return this;
    }
    public GetStackGroupResponseBodyStackGroup getStackGroup() {
        return this.stackGroup;
    }

    public static class GetStackGroupResponseBodyStackGroupAutoDeployment extends TeaModel {
        /**
         * <p>Indicates whether automatic deployment is enabled or disabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: Automatic deployment is enabled. If you add a new member account to the folder, the stack group automatically deploys stack instances in the specified region of the new account. If you remove a member account from the folder, the stack group automatically deletes stack instances from the specified region of the account.</p>
         * </li>
         * <li><p>false: Automatic deployment is disabled. After automatic deployment is disabled, the stack instances remain unchanged when the member accounts in the folder change.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether to retain the stacks in the member account when the member account is removed from the folder.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: retains the stacks.</p>
         * </li>
         * <li><p>false: deletes the stacks.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if Enabled is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RetainStacksOnAccountRemoval")
        public Boolean retainStacksOnAccountRemoval;

        public static GetStackGroupResponseBodyStackGroupAutoDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroupAutoDeployment self = new GetStackGroupResponseBodyStackGroupAutoDeployment();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroupAutoDeployment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetStackGroupResponseBodyStackGroupAutoDeployment setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

    }

    public static class GetStackGroupResponseBodyStackGroupParameters extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetStackGroupResponseBodyStackGroupParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroupParameters self = new GetStackGroupResponseBodyStackGroupParameters();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroupParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackGroupResponseBodyStackGroupParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail extends TeaModel {
        /**
         * <p>The number of stack instances for which the drift detection operation was canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CancelledStackInstancesCount")
        public Integer cancelledStackInstancesCount;

        /**
         * <p>The drift detection status of the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>COMPLETED: The drift detection operation is completed for the stack group. All stack instances have been successfully drift-detected.</p>
         * </li>
         * <li><p>FAILED: The drift detection operation is completed for the stack group. The number of stack instances that failed the drift detection exceeds the specified threshold.</p>
         * </li>
         * <li><p>PARTIAL_SUCCESS: The drift detection operation is completed for the stack group. The drift detection operation failed for some stack instances, but the number of failures did not exceed the threshold.</p>
         * </li>
         * <li><p>IN_PROGRESS: The drift detection operation is in progress for the stack group.</p>
         * </li>
         * <li><p>STOPPED: The drift detection operation on the stack group was canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("DriftDetectionStatus")
        public String driftDetectionStatus;

        /**
         * <p>The time when the drift detection operation was performed on the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-27T07:47:47</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The number of stack instances that are in the DRIFTED state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DriftedStackInstancesCount")
        public Integer driftedStackInstancesCount;

        /**
         * <p>The number of stack instances for which the drift detection operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedStackInstancesCount")
        public Integer failedStackInstancesCount;

        /**
         * <p>The number of stack instances on which a drift detection operation is in progress.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InProgressStackInstancesCount")
        public Integer inProgressStackInstancesCount;

        /**
         * <p>The number of stack instances that are in the IN_SYNC state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InSyncStackInstancesCount")
        public Integer inSyncStackInstancesCount;

        /**
         * <p>The drift status of the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>DRIFTED: At least one stack instance has drifted.</p>
         * </li>
         * <li><p>NOT_CHECKED: No successful drift detection has been performed on the stack group.</p>
         * </li>
         * <li><p>IN_SYNC: All stack instances are in the IN_SYNC state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DRIFTED</p>
         */
        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

        /**
         * <p>The number of stack instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalStackInstancesCount")
        public Integer totalStackInstancesCount;

        public static GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail self = new GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
            this.cancelledStackInstancesCount = cancelledStackInstancesCount;
            return this;
        }
        public Integer getCancelledStackInstancesCount() {
            return this.cancelledStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }
        public String getDriftDetectionStatus() {
            return this.driftDetectionStatus;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
            this.driftedStackInstancesCount = driftedStackInstancesCount;
            return this;
        }
        public Integer getDriftedStackInstancesCount() {
            return this.driftedStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setFailedStackInstancesCount(Integer failedStackInstancesCount) {
            this.failedStackInstancesCount = failedStackInstancesCount;
            return this;
        }
        public Integer getFailedStackInstancesCount() {
            return this.failedStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
            this.inProgressStackInstancesCount = inProgressStackInstancesCount;
            return this;
        }
        public Integer getInProgressStackInstancesCount() {
            return this.inProgressStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setInSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
            this.inSyncStackInstancesCount = inSyncStackInstancesCount;
            return this;
        }
        public Integer getInSyncStackInstancesCount() {
            return this.inSyncStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setTotalStackInstancesCount(Integer totalStackInstancesCount) {
            this.totalStackInstancesCount = totalStackInstancesCount;
            return this;
        }
        public Integer getTotalStackInstancesCount() {
            return this.totalStackInstancesCount;
        }

    }

    public static class GetStackGroupResponseBodyStackGroup extends TeaModel {
        /**
         * <p>The name of the RAM administrator role that is assumed by ROS. This parameter is specified when you create a stack group in self-managed permission mode. If you do not specify this parameter, the default value AliyunROSStackGroupAdministrationRole is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunROSStackGroupAdministrationRole</p>
         */
        @NameInMap("AdministrationRoleName")
        public String administrationRoleName;

        /**
         * <p>The information about automatic deployment settings.</p>
         * <blockquote>
         * <p>This parameter is returned only if PermissionModel is set to SERVICE_MANAGED.</p>
         * </blockquote>
         */
        @NameInMap("AutoDeployment")
        public GetStackGroupResponseBodyStackGroupAutoDeployment autoDeployment;

        /**
         * <p>The time when the stack group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-14T02:13:50</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>StackGroup Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the RAM execution role that is assumed by the administrator role AliyunROSStackGroupAdministrationRole. This parameter is specified when you create a stack group in self-managed permission mode. If you do not specify this parameter, the default value AliyunROSStackGroupExecutionRole is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunROSStackGroupExecutionRole</p>
         */
        @NameInMap("ExecutionRoleName")
        public String executionRoleName;

        /**
         * <p>The list of the parameters of the stack group.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<GetStackGroupResponseBodyStackGroupParameters> parameters;

        /**
         * <p>The permission model.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SELF_MANAGED: self-managed permissions.</p>
         * </li>
         * <li><p>SERVICE_MANAGED: service-managed permissions.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information about the permission models of stack groups, refer to <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELF_MANAGED</p>
         */
        @NameInMap("PermissionModel")
        public String permissionModel;

        /**
         * <p>The IDs of the folders in the resource directory. Stack instances are deployed in all the accounts in the folders.</p>
         * <blockquote>
         * <p>This parameter is returned only if PermissionModel is set to SERVICE_MANAGED.</p>
         * </blockquote>
         */
        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        /**
         * <p>The ID of the resource group. This value is determined by the resource group ID that you specify when you create the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The details of the last successful drift detection operation on the stack group.</p>
         */
        @NameInMap("StackGroupDriftDetectionDetail")
        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        /**
         * <p>The ID of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The status of the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ACTIVE: The stack group is active.</p>
         * </li>
         * <li><p>DELETED: The stack group is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The structure of the template body.</p>
         * <blockquote>
         * <p>We recommend that you do not use this parameter. Use TemplateContent instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
         */
        @NameInMap("TemplateBody")
        public String templateBody;

        /**
         * <p>The structure of the template body. The structure is in the JSON format. For more information, refer to <a href="https://help.aliyun.com/document_detail/28857.html">Template syntax</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;
         * }</p>
         */
        @NameInMap("TemplateContent")
        public String templateContent;

        /**
         * <p>The time when the stack group was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-15T02:01:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetStackGroupResponseBodyStackGroup build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroup self = new GetStackGroupResponseBodyStackGroup();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroup setAdministrationRoleName(String administrationRoleName) {
            this.administrationRoleName = administrationRoleName;
            return this;
        }
        public String getAdministrationRoleName() {
            return this.administrationRoleName;
        }

        public GetStackGroupResponseBodyStackGroup setAutoDeployment(GetStackGroupResponseBodyStackGroupAutoDeployment autoDeployment) {
            this.autoDeployment = autoDeployment;
            return this;
        }
        public GetStackGroupResponseBodyStackGroupAutoDeployment getAutoDeployment() {
            return this.autoDeployment;
        }

        public GetStackGroupResponseBodyStackGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStackGroupResponseBodyStackGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStackGroupResponseBodyStackGroup setExecutionRoleName(String executionRoleName) {
            this.executionRoleName = executionRoleName;
            return this;
        }
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        public GetStackGroupResponseBodyStackGroup setParameters(java.util.List<GetStackGroupResponseBodyStackGroupParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetStackGroupResponseBodyStackGroupParameters> getParameters() {
            return this.parameters;
        }

        public GetStackGroupResponseBodyStackGroup setPermissionModel(String permissionModel) {
            this.permissionModel = permissionModel;
            return this;
        }
        public String getPermissionModel() {
            return this.permissionModel;
        }

        public GetStackGroupResponseBodyStackGroup setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

        public GetStackGroupResponseBodyStackGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupDriftDetectionDetail(GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
            this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
            return this;
        }
        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
            return this.stackGroupDriftDetectionDetail;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackGroupResponseBodyStackGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackGroupResponseBodyStackGroup setTemplateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }
        public String getTemplateBody() {
            return this.templateBody;
        }

        public GetStackGroupResponseBodyStackGroup setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public GetStackGroupResponseBodyStackGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
