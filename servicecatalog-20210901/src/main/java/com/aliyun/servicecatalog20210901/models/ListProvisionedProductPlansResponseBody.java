// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlansResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlanDetails")
    public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetails> planDetails;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PrincipalName")
        public String principalName;

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
        @NameInMap("ParameterKey")
        public String parameterKey;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AssignedApprovers")
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsAssignedApprovers> assignedApprovers;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("OwnerPrincipalId")
        public String ownerPrincipalId;

        @NameInMap("OwnerPrincipalName")
        public String ownerPrincipalName;

        @NameInMap("OwnerPrincipalType")
        public String ownerPrincipalType;

        @NameInMap("Parameters")
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsParameters> parameters;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("PlanType")
        public String planType;

        @NameInMap("PortfolioId")
        public String portfolioId;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductVersionId")
        public String productVersionId;

        @NameInMap("ProvisionedProductId")
        public String provisionedProductId;

        @NameInMap("ProvisionedProductName")
        public String provisionedProductName;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("StackRegionId")
        public String stackRegionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("Tags")
        public java.util.List<ListProvisionedProductPlansResponseBodyPlanDetailsTags> tags;

        @NameInMap("Uid")
        public String uid;

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
