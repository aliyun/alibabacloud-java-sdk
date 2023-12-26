// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProvisionedProductPlanResponseBody extends TeaModel {
    /**
     * <p>The details of the plan.</p>
     */
    @NameInMap("PlanDetail")
    public GetProvisionedProductPlanResponseBodyPlanDetail planDetail;

    /**
     * <p>The details of the product.</p>
     */
    @NameInMap("ProductDetail")
    public GetProvisionedProductPlanResponseBodyProductDetail productDetail;

    /**
     * <p>The details of the product version.</p>
     */
    @NameInMap("ProductVersionDetail")
    public GetProvisionedProductPlanResponseBodyProductVersionDetail productVersionDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the resources to be changed in the plan.</p>
     */
    @NameInMap("ResourceChanges")
    public java.util.List<GetProvisionedProductPlanResponseBodyResourceChanges> resourceChanges;

    public static GetProvisionedProductPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionedProductPlanResponseBody self = new GetProvisionedProductPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProvisionedProductPlanResponseBody setPlanDetail(GetProvisionedProductPlanResponseBodyPlanDetail planDetail) {
        this.planDetail = planDetail;
        return this;
    }
    public GetProvisionedProductPlanResponseBodyPlanDetail getPlanDetail() {
        return this.planDetail;
    }

    public GetProvisionedProductPlanResponseBody setProductDetail(GetProvisionedProductPlanResponseBodyProductDetail productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public GetProvisionedProductPlanResponseBodyProductDetail getProductDetail() {
        return this.productDetail;
    }

    public GetProvisionedProductPlanResponseBody setProductVersionDetail(GetProvisionedProductPlanResponseBodyProductVersionDetail productVersionDetail) {
        this.productVersionDetail = productVersionDetail;
        return this;
    }
    public GetProvisionedProductPlanResponseBodyProductVersionDetail getProductVersionDetail() {
        return this.productVersionDetail;
    }

    public GetProvisionedProductPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProvisionedProductPlanResponseBody setResourceChanges(java.util.List<GetProvisionedProductPlanResponseBodyResourceChanges> resourceChanges) {
        this.resourceChanges = resourceChanges;
        return this;
    }
    public java.util.List<GetProvisionedProductPlanResponseBodyResourceChanges> getResourceChanges() {
        return this.resourceChanges;
    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator extends TeaModel {
        /**
         * <p>The RAM entity ID of the operator.</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The RAM entity name of the operator.</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The RAM entity type of the operator. Valid values:</p>
         * <br>
         * <p>*   RamUser: a RAM user</p>
         * <p>*   RamRole: a RAM role</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator self = new GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords extends TeaModel {
        /**
         * <p>The operation that is performed by the operator on the plan. Valid values:</p>
         * <br>
         * <p>*   Submit: submits the plan.</p>
         * <p>*   Cancel: cancels the plan.</p>
         * <p>*   Approve: approves the plan.</p>
         * <p>*   reject: rejects the plan.</p>
         */
        @NameInMap("ApprovalAction")
        public String approvalAction;

        /**
         * <p>The review comment of the operator.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the operation was performed.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The operator who performs operations on the plan.</p>
         */
        @NameInMap("Operator")
        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator operator;

        public static GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords self = new GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords setApprovalAction(String approvalAction) {
            this.approvalAction = approvalAction;
            return this;
        }
        public String getApprovalAction() {
            return this.approvalAction;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords setOperator(GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator operator) {
            this.operator = operator;
            return this;
        }
        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecordsOperator getOperator() {
            return this.operator;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator extends TeaModel {
        /**
         * <p>The RAM entity name of the operator.</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The RAM entity type of the operator. Valid values:</p>
         * <br>
         * <p>*   RamUser: a RAM user</p>
         * <p>*   RamRole: a RAM role</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator self = new GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks extends TeaModel {
        /**
         * <p>The operator who performs operations on the plan.</p>
         */
        @NameInMap("Operator")
        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator operator;

        public static GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks self = new GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks setOperator(GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator operator) {
            this.operator = operator;
            return this;
        }
        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasksOperator getOperator() {
            return this.operator;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities extends TeaModel {
        /**
         * <p>The name of the operation that is being performed by the plan.</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>An array consisting of tasks that are pending for review.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks> tasks;

        public static GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities self = new GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities setTasks(java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivitiesTasks> getTasks() {
            return this.tasks;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail extends TeaModel {
        /**
         * <p>An array that consists of operations that are performed by the operator.</p>
         */
        @NameInMap("OperationRecords")
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords> operationRecords;

        /**
         * <p>An array that consists of operations that are being performed by the plan.</p>
         */
        @NameInMap("TodoTaskActivities")
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities> todoTaskActivities;

        public static GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail self = new GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail setOperationRecords(java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords> operationRecords) {
            this.operationRecords = operationRecords;
            return this;
        }
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailOperationRecords> getOperationRecords() {
            return this.operationRecords;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail setTodoTaskActivities(java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities> todoTaskActivities) {
            this.todoTaskActivities = todoTaskActivities;
            return this;
        }
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetailTodoTaskActivities> getTodoTaskActivities() {
            return this.todoTaskActivities;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers extends TeaModel {
        /**
         * <p>The RAM entity name of the reviewer.</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the Resource Access Management (RAM) entity of the reviewer. Valid values:</p>
         * <br>
         * <p>*   RamUser: a RAM user</p>
         * <p>*   RamRole: a RAM role</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers self = new GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailParameters extends TeaModel {
        /**
         * <p>The name of the parameter in the template.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter in the template.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetProvisionedProductPlanResponseBodyPlanDetailParameters build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailParameters self = new GetProvisionedProductPlanResponseBodyPlanDetailParameters();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailTags extends TeaModel {
        /**
         * <p>The key of the custom tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetProvisionedProductPlanResponseBodyPlanDetailTags build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetailTags self = new GetProvisionedProductPlanResponseBodyPlanDetailTags();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetailTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetail extends TeaModel {
        /**
         * <p>The review details of the plan.</p>
         */
        @NameInMap("ApprovalDetail")
        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail approvalDetail;

        /**
         * <p>An array that consists of reviewers.</p>
         */
        @NameInMap("AssignedApprovers")
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers> assignedApprovers;

        /**
         * <p>The time when the plan was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The purpose of the plan. Valid values:</p>
         * <br>
         * <p>*   LaunchProduct: launches the product.</p>
         * <p>*   UpdateProvisionedProduct: updates the information about the product instance.</p>
         * <p>*   TerminateProvisionedProduct: terminates the product instance.</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The ID of the RAM entity to which the plan belongs.</p>
         */
        @NameInMap("OwnerPrincipalId")
        public String ownerPrincipalId;

        /**
         * <p>The name of the RAM entity to which the plan belongs.</p>
         */
        @NameInMap("OwnerPrincipalName")
        public String ownerPrincipalName;

        /**
         * <p>The type of the RAM entity to which the plan belongs. Valid values:</p>
         * <br>
         * <p>*   RamUser: a RAM user</p>
         * <p>*   RamRole: a RAM role</p>
         */
        @NameInMap("OwnerPrincipalType")
        public String ownerPrincipalType;

        /**
         * <p>An array that consists of the parameters in the template.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailParameters> parameters;

        /**
         * <p>The ID of the plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The name of the plan.</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The type of the plan.</p>
         * <br>
         * <p>The value is fixed as Ros, which indicates Resource Orchestration Service (ROS).</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The ID of the product portfolio.</p>
         */
        @NameInMap("PortfolioId")
        public String portfolioId;

        /**
         * <p>The ID of the product.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The ID of the product version.</p>
         */
        @NameInMap("ProductVersionId")
        public String productVersionId;

        /**
         * <p>The ID of the product instance.</p>
         */
        @NameInMap("ProvisionedProductId")
        public String provisionedProductId;

        /**
         * <p>The name of the product instance.</p>
         */
        @NameInMap("ProvisionedProductName")
        public String provisionedProductName;

        /**
         * <p>The ID of the ROS stack.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The ID of the region to which the ROS stack belongs.</p>
         */
        @NameInMap("StackRegionId")
        public String stackRegionId;

        /**
         * <p>The state of the plan. Valid values:</p>
         * <br>
         * <p>*   PreviewInProgress: The plan is being prechecked.</p>
         * <p>*   PreviewSuccess: The precheck is successful.</p>
         * <p>*   PreviewFailed: The precheck fails.</p>
         * <p>*   ExecuteInProgress: The plan is being run.</p>
         * <p>*   ExecuteSuccess: The plan is run.</p>
         * <p>*   ExecuteFailed: The plan fails to be run.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The message returned for the state.</p>
         * <br>
         * <p>> This parameter is returned only when PreviewFailed or ExecuteFailed is returned for Status.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>An array that consists of custom tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailTags> tags;

        /**
         * <p>The ID of the Alibaba Cloud account to which the plan belongs.</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The last time when the task was modified.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetProvisionedProductPlanResponseBodyPlanDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetail self = new GetProvisionedProductPlanResponseBodyPlanDetail();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setApprovalDetail(GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail approvalDetail) {
            this.approvalDetail = approvalDetail;
            return this;
        }
        public GetProvisionedProductPlanResponseBodyPlanDetailApprovalDetail getApprovalDetail() {
            return this.approvalDetail;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setAssignedApprovers(java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers> assignedApprovers) {
            this.assignedApprovers = assignedApprovers;
            return this;
        }
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailAssignedApprovers> getAssignedApprovers() {
            return this.assignedApprovers;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setOwnerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }
        public String getOwnerPrincipalId() {
            return this.ownerPrincipalId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setOwnerPrincipalName(String ownerPrincipalName) {
            this.ownerPrincipalName = ownerPrincipalName;
            return this;
        }
        public String getOwnerPrincipalName() {
            return this.ownerPrincipalName;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setOwnerPrincipalType(String ownerPrincipalType) {
            this.ownerPrincipalType = ownerPrincipalType;
            return this;
        }
        public String getOwnerPrincipalType() {
            return this.ownerPrincipalType;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setParameters(java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailParameters> getParameters() {
            return this.parameters;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setProvisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setProvisionedProductName(String provisionedProductName) {
            this.provisionedProductName = provisionedProductName;
            return this;
        }
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setStackRegionId(String stackRegionId) {
            this.stackRegionId = stackRegionId;
            return this;
        }
        public String getStackRegionId() {
            return this.stackRegionId;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setTags(java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailTags> getTags() {
            return this.tags;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyProductDetail extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the product.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the product.</p>
         */
        @NameInMap("ProductArn")
        public String productArn;

        /**
         * <p>The ID of the product.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The name of the product.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The type of the product.</p>
         * <br>
         * <p>The value is fixed as Ros, which indicates ROS.</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The provider of the product.</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        public static GetProvisionedProductPlanResponseBodyProductDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyProductDetail self = new GetProvisionedProductPlanResponseBodyProductDetail();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyProductDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProvisionedProductPlanResponseBodyProductDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProvisionedProductPlanResponseBodyProductDetail setProductArn(String productArn) {
            this.productArn = productArn;
            return this;
        }
        public String getProductArn() {
            return this.productArn;
        }

        public GetProvisionedProductPlanResponseBodyProductDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProvisionedProductPlanResponseBodyProductDetail setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProvisionedProductPlanResponseBodyProductDetail setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetProvisionedProductPlanResponseBodyProductDetail setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyProductVersionDetail extends TeaModel {
        /**
         * <p>Indicates whether the product version is visible to end users. Valid values:</p>
         * <br>
         * <p>*   true (default)</p>
         * <p>*   false</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The time when the product version was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the product version.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The recommendation information. Valid values:</p>
         * <br>
         * <p>*   Default: No recommendation information is provided. This is the default value.</p>
         * <p>*   Recommended: the recommendation version.</p>
         * <p>*   Latest: the latest version.</p>
         * <p>*   Deprecated: the version that is about to be deprecated.</p>
         */
        @NameInMap("Guidance")
        public String guidance;

        /**
         * <p>The ID of the product to which the product version belongs.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The ID of the product version.</p>
         */
        @NameInMap("ProductVersionId")
        public String productVersionId;

        /**
         * <p>The name for the version of the product.</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>The type of the template.</p>
         * <br>
         * <p>The value is fixed as RosTerraformTemplate, which indicates that the Terraform template is supported by ROS.</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The URL of the template.</p>
         */
        @NameInMap("TemplateUrl")
        public String templateUrl;

        public static GetProvisionedProductPlanResponseBodyProductVersionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyProductVersionDetail self = new GetProvisionedProductPlanResponseBodyProductVersionDetail();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setGuidance(String guidance) {
            this.guidance = guidance;
            return this;
        }
        public String getGuidance() {
            return this.guidance;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetProvisionedProductPlanResponseBodyProductVersionDetail setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

    }

    public static class GetProvisionedProductPlanResponseBodyResourceChanges extends TeaModel {
        /**
         * <p>The action that is performed on the resource. Valid values:</p>
         * <br>
         * <p>*   Add</p>
         * <p>*   Modify</p>
         * <p>*   Remove</p>
         * <p>*   None</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The logical ID of the resource.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The physical ID of the resource.</p>
         * <br>
         * <p>> This parameter is returned only when Action is set to Modify or Remove.</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>Indicates whether a replacement update is performed on the template. Valid values:</p>
         * <br>
         * <p>*   True: A replacement update is performed on the template.</p>
         * <p>*   False: A change is made on the template.</p>
         * <p>*   Conditional: A replacement update may be performed on the template. You can check whether a replacement update is performed when the template is in use.</p>
         * <br>
         * <p>> This parameter is returned only when Action is set to Modify.</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetProvisionedProductPlanResponseBodyResourceChanges build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyResourceChanges self = new GetProvisionedProductPlanResponseBodyResourceChanges();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyResourceChanges setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetProvisionedProductPlanResponseBodyResourceChanges setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public GetProvisionedProductPlanResponseBodyResourceChanges setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public GetProvisionedProductPlanResponseBodyResourceChanges setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

        public GetProvisionedProductPlanResponseBodyResourceChanges setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
