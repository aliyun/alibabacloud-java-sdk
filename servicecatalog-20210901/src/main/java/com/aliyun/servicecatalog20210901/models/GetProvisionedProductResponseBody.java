// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProvisionedProductResponseBody extends TeaModel {
    // 实例信息
    @NameInMap("ProvisionedProductDetail")
    public GetProvisionedProductResponseBodyProvisionedProductDetail provisionedProductDetail;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetProvisionedProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionedProductResponseBody self = new GetProvisionedProductResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProvisionedProductResponseBody setProvisionedProductDetail(GetProvisionedProductResponseBodyProvisionedProductDetail provisionedProductDetail) {
        this.provisionedProductDetail = provisionedProductDetail;
        return this;
    }
    public GetProvisionedProductResponseBodyProvisionedProductDetail getProvisionedProductDetail() {
        return this.provisionedProductDetail;
    }

    public GetProvisionedProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProvisionedProductResponseBodyProvisionedProductDetail extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 上一次执行的实例操作任务ID
        @NameInMap("LastProvisioningTaskId")
        public String lastProvisioningTaskId;

        // 上一次成功执行的实例操作任务ID
        @NameInMap("LastSuccessfulProvisioningTaskId")
        public String lastSuccessfulProvisioningTaskId;

        // 上一次执行的任务ID
        @NameInMap("LastTaskId")
        public String lastTaskId;

        // 归属人的RAM实体ID
        @NameInMap("OwnerPrincipalId")
        public String ownerPrincipalId;

        // 归属人的RAM实体类型
        @NameInMap("OwnerPrincipalType")
        public String ownerPrincipalType;

        // 产品组合ID
        @NameInMap("PortfolioId")
        public String portfolioId;

        // 产品ID
        @NameInMap("ProductId")
        public String productId;

        // 产品名称
        @NameInMap("ProductName")
        public String productName;

        // 产品版本ID
        @NameInMap("ProductVersionId")
        public String productVersionId;

        // 产品版本名称
        @NameInMap("ProductVersionName")
        public String productVersionName;

        // 实例ARN
        @NameInMap("ProvisionedProductArn")
        public String provisionedProductArn;

        // 实例ID
        @NameInMap("ProvisionedProductId")
        public String provisionedProductId;

        // 实例名称
        @NameInMap("ProvisionedProductName")
        public String provisionedProductName;

        @NameInMap("ProvisionedProductType")
        public String provisionedProductType;

        // ROS资源栈的ID
        @NameInMap("StackId")
        public String stackId;

        // ROS资源栈所属的地域ID
        @NameInMap("StackRegionId")
        public String stackRegionId;

        // 实例状态
        @NameInMap("Status")
        public String status;

        // 实例状态说明
        @NameInMap("StatusMessage")
        public String statusMessage;

        public static GetProvisionedProductResponseBodyProvisionedProductDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProvisionedProductResponseBodyProvisionedProductDetail self = new GetProvisionedProductResponseBodyProvisionedProductDetail();
            return TeaModel.build(map, self);
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setLastProvisioningTaskId(String lastProvisioningTaskId) {
            this.lastProvisioningTaskId = lastProvisioningTaskId;
            return this;
        }
        public String getLastProvisioningTaskId() {
            return this.lastProvisioningTaskId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setLastSuccessfulProvisioningTaskId(String lastSuccessfulProvisioningTaskId) {
            this.lastSuccessfulProvisioningTaskId = lastSuccessfulProvisioningTaskId;
            return this;
        }
        public String getLastSuccessfulProvisioningTaskId() {
            return this.lastSuccessfulProvisioningTaskId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setLastTaskId(String lastTaskId) {
            this.lastTaskId = lastTaskId;
            return this;
        }
        public String getLastTaskId() {
            return this.lastTaskId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setOwnerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }
        public String getOwnerPrincipalId() {
            return this.ownerPrincipalId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setOwnerPrincipalType(String ownerPrincipalType) {
            this.ownerPrincipalType = ownerPrincipalType;
            return this;
        }
        public String getOwnerPrincipalType() {
            return this.ownerPrincipalType;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProvisionedProductArn(String provisionedProductArn) {
            this.provisionedProductArn = provisionedProductArn;
            return this;
        }
        public String getProvisionedProductArn() {
            return this.provisionedProductArn;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProvisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProvisionedProductName(String provisionedProductName) {
            this.provisionedProductName = provisionedProductName;
            return this;
        }
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setProvisionedProductType(String provisionedProductType) {
            this.provisionedProductType = provisionedProductType;
            return this;
        }
        public String getProvisionedProductType() {
            return this.provisionedProductType;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setStackRegionId(String stackRegionId) {
            this.stackRegionId = stackRegionId;
            return this;
        }
        public String getStackRegionId() {
            return this.stackRegionId;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProvisionedProductResponseBodyProvisionedProductDetail setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

}
