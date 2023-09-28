// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlansResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array that consists of plans.</p>
     */
    @NameInMap("PlanDetails")
    public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetails> planDetails;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProvisionedProductPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductPlansResponseBody self = new ListProvisionedProductPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProvisionedProductPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProvisionedProductPlansResponseBody setPlanDetails(java.util.List<ListProvisionedProductPlansResponseBodyPlanDetails> planDetails) {
        this.planDetails = planDetails;
        return this;
    }
    public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetails> getPlanDetails() {
        return this.planDetails;
    }

    public ListProvisionedProductPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProvisionedProductPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers extends TeaModel {
        /**
         * <p>The RAM entity name of the reviewer.</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the RAM entity of the reviewer. Valid values:</p>
         * <br>
         * <p>*   RamUser: a RAM user</p>
         * <p>*   RamRole: a RAM role</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers self = new ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListProvisionedProductPlansResponseBodyPlanDetailsParameters extends TeaModel {
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

        public static ListProvisionedProductPlansResponseBodyPlanDetailsParameters build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductPlansResponseBodyPlanDetailsParameters self = new ListProvisionedProductPlansResponseBodyPlanDetailsParameters();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductPlansResponseBodyPlanDetailsParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetailsParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class ListProvisionedProductPlansResponseBodyPlanDetailsTags extends TeaModel {
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

        public static ListProvisionedProductPlansResponseBodyPlanDetailsTags build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductPlansResponseBodyPlanDetailsTags self = new ListProvisionedProductPlansResponseBodyPlanDetailsTags();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductPlansResponseBodyPlanDetailsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetailsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProvisionedProductPlansResponseBodyPlanDetails extends TeaModel {
        /**
         * <p>An array that consists of reviewers.</p>
         */
        @NameInMap("AssignedApprovers")
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers> assignedApprovers;

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
         * <p>*   LaunchProduct: launches the product. This is the default value.</p>
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
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsParameters> parameters;

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
         * <p>The name of the product.</p>
         */
        @NameInMap("ProductName")
        public String productName;

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
         * <p>*   ApplicationInProgress: The plan is being reviewed.</p>
         * <p>*   ApplicationApproved: The plan is approved.</p>
         * <p>*   ApplicationRejected: The approval is rejected.</p>
         * <p>*   ExecuteInProgress: The plan is being run.</p>
         * <p>*   ExecuteSuccess: The plan is run.</p>
         * <p>*   ExecuteFailed: The plan fails to be run.</p>
         * <p>*   Canceled: The plan is canceled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The message returned for the state.</p>
         * <br>
         * <p>> This parameter is returned only when PreviewFailed or ExecuteFailed is returned for the Status parameter.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>An array that consists of custom tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsTags> tags;

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

        public static ListProvisionedProductPlansResponseBodyPlanDetails build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductPlansResponseBodyPlanDetails self = new ListProvisionedProductPlansResponseBodyPlanDetails();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setAssignedApprovers(java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers> assignedApprovers) {
            this.assignedApprovers = assignedApprovers;
            return this;
        }
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers> getAssignedApprovers() {
            return this.assignedApprovers;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setOwnerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }
        public String getOwnerPrincipalId() {
            return this.ownerPrincipalId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setOwnerPrincipalName(String ownerPrincipalName) {
            this.ownerPrincipalName = ownerPrincipalName;
            return this;
        }
        public String getOwnerPrincipalName() {
            return this.ownerPrincipalName;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setOwnerPrincipalType(String ownerPrincipalType) {
            this.ownerPrincipalType = ownerPrincipalType;
            return this;
        }
        public String getOwnerPrincipalType() {
            return this.ownerPrincipalType;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setParameters(java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsParameters> getParameters() {
            return this.parameters;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setProvisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setProvisionedProductName(String provisionedProductName) {
            this.provisionedProductName = provisionedProductName;
            return this;
        }
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setStackRegionId(String stackRegionId) {
            this.stackRegionId = stackRegionId;
            return this;
        }
        public String getStackRegionId() {
            return this.stackRegionId;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setTags(java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsTags> getTags() {
            return this.tags;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListProvisionedProductPlansResponseBodyPlanDetails setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
