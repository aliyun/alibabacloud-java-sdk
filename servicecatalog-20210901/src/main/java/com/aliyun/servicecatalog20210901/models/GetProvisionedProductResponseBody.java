// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProvisionedProductResponseBody extends TeaModel {
    /**
     * <p>The details of the product instance.</p>
     */
    @NameInMap("ProvisionedProductDetail")
    public GetProvisionedProductResponseBodyProvisionedProductDetail provisionedProductDetail;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The time when the product instance is created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the task that is last run on the product instance.</p>
         * <br>
         * <p>The task can be one of the following types:</p>
         * <br>
         * <p>*   LaunchProduct: launches the product.</p>
         * <p>*   UpdateProvisionedProduct: updates the information about the product instance.</p>
         * <p>*   TerminateProvisionedProduct: terminates the product instance.</p>
         */
        @NameInMap("LastProvisioningTaskId")
        public String lastProvisioningTaskId;

        /**
         * <p>The ID of the last task successfully run on the product instance.</p>
         * <br>
         * <p>The task can be one of the following types:</p>
         * <br>
         * <p>*   LaunchProduct: launches the product.</p>
         * <p>*   UpdateProvisionedProduct: updates the information about the product instance.</p>
         * <p>*   TerminateProvisionedProduct: terminates the product instance.</p>
         */
        @NameInMap("LastSuccessfulProvisioningTaskId")
        public String lastSuccessfulProvisioningTaskId;

        /**
         * <p>The ID of the task that is last run.</p>
         */
        @NameInMap("LastTaskId")
        public String lastTaskId;

        /**
         * <p>The ID of the RAM entity to which the product instance belongs.</p>
         */
        @NameInMap("OwnerPrincipalId")
        public String ownerPrincipalId;

        /**
         * <p>The type of the Resource Access Management (RAM) entity to which the product instance belongs. Valid values:</p>
         * <br>
         * <p>*   RamUser: a RAM user</p>
         * <p>*   RamRole: a RAM role</p>
         */
        @NameInMap("OwnerPrincipalType")
        public String ownerPrincipalType;

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
         * <p>The name of the product version.</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the product instance.</p>
         */
        @NameInMap("ProvisionedProductArn")
        public String provisionedProductArn;

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
         * <p>The type of the product instance.</p>
         * <br>
         * <p>The value is fixed as RosStack, which indicates a ROS stack.</p>
         */
        @NameInMap("ProvisionedProductType")
        public String provisionedProductType;

        /**
         * <p>The ID of the Resource Orchestration Service (ROS) stack.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The ID of the region to which the ROS stack belongs.</p>
         */
        @NameInMap("StackRegionId")
        public String stackRegionId;

        /**
         * <p>The state of the product instance. Valid values:</p>
         * <br>
         * <p>*   Available: The product instance is available.</p>
         * <p>*   UnderChange: The information about the product instance is being changed.</p>
         * <p>*   Error: An exception occurred on the product instance.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The message that is returned for the state.</p>
         * <br>
         * <p>>  This parameter is returned only when Error is returned for the Status parameter.</p>
         */
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
