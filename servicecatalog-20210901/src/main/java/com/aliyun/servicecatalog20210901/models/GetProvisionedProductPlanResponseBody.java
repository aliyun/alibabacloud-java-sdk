// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProvisionedProductPlanResponseBody extends TeaModel {
    @NameInMap("PlanDetail")
    public GetProvisionedProductPlanResponseBodyPlanDetail planDetail;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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

    public GetProvisionedProductPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProvisionedProductPlanResponseBodyPlanDetailParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

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

    public static class GetProvisionedProductPlanResponseBodyPlanDetail extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Parameters")
        public java.util.List<GetProvisionedProductPlanResponseBodyPlanDetailParameters> parameters;

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

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetProvisionedProductPlanResponseBodyPlanDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductPlanResponseBodyPlanDetail self = new GetProvisionedProductPlanResponseBodyPlanDetail();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductPlanResponseBodyPlanDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public GetProvisionedProductPlanResponseBodyPlanDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
