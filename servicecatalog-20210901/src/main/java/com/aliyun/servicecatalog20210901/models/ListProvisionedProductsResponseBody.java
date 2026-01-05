// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product instances.</p>
     */
    @NameInMap("ProvisionedProductDetails")
    public java.util.List<ListProvisionedProductsResponseBodyProvisionedProductDetails> provisionedProductDetails;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProvisionedProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductsResponseBody self = new ListProvisionedProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProvisionedProductsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProvisionedProductsResponseBody setProvisionedProductDetails(java.util.List<ListProvisionedProductsResponseBodyProvisionedProductDetails> provisionedProductDetails) {
        this.provisionedProductDetails = provisionedProductDetails;
        return this;
    }
    public java.util.List<ListProvisionedProductsResponseBodyProvisionedProductDetails> getProvisionedProductDetails() {
        return this.provisionedProductDetails;
    }

    public ListProvisionedProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProvisionedProductsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProvisionedProductsResponseBodyProvisionedProductDetails extends TeaModel {
        /**
         * <p>The time when the product instance was created.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-23T09:46:27Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the task that was last run on the product instance.</p>
         * <p>The task can be one of the following types:</p>
         * <ul>
         * <li>LaunchProduct: a task that launches the product.</li>
         * <li>UpdateProvisionedProduct: a task that updates the information about the product instance.</li>
         * <li>TerminateProvisionedProduct: a task that terminates the product instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>task-bp1dmg242c****</p>
         */
        @NameInMap("LastProvisioningTaskId")
        public String lastProvisioningTaskId;

        /**
         * <p>The ID of the last task that was successfully run on the product instance.</p>
         * <p>The task can be one of the following types:</p>
         * <ul>
         * <li>LaunchProduct: a task that launches the product.</li>
         * <li>UpdateProvisionedProduct: a task that updates the information about the product instance.</li>
         * <li>TerminateProvisionedProduct: a task that terminates the product instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>task-bp1dmg242c****</p>
         */
        @NameInMap("LastSuccessfulProvisioningTaskId")
        public String lastSuccessfulProvisioningTaskId;

        /**
         * <p>The ID of the task that was last run.</p>
         * 
         * <strong>example:</strong>
         * <p>task-bp1dmg242c****</p>
         */
        @NameInMap("LastTaskId")
        public String lastTaskId;

        /**
         * <p>The ID of the RAM entity to which the product instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>24477111603637****</p>
         */
        @NameInMap("OwnerPrincipalId")
        public String ownerPrincipalId;

        /**
         * <p>The type of the Resource Access Management (RAM) entity to which the product instance belongs. Valid values:</p>
         * <ul>
         * <li>RamUser: a RAM user</li>
         * <li>RamRole: a RAM role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        @NameInMap("OwnerPrincipalType")
        public String ownerPrincipalType;

        /**
         * <p>The ID of the product portfolio.</p>
         * 
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        @NameInMap("PortfolioId")
        public String portfolioId;

        /**
         * <p>The ID of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The name of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO-Create an ECS instance</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The ID of the product version.</p>
         * 
         * <strong>example:</strong>
         * <p>pv-bp15e79d26****</p>
         */
        @NameInMap("ProductVersionId")
        public String productVersionId;

        /**
         * <p>The name of the product version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the product instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:servicecatalog:cn-hangzhou:146611588617****:provisionedproduct/pp-bp1ddg1n2a****</p>
         */
        @NameInMap("ProvisionedProductArn")
        public String provisionedProductArn;

        /**
         * <p>The ID of the product instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pp-bp1ddg1n2a****</p>
         */
        @NameInMap("ProvisionedProductId")
        public String provisionedProductId;

        /**
         * <p>The name of the product instance.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO-ECS instance</p>
         */
        @NameInMap("ProvisionedProductName")
        public String provisionedProductName;

        /**
         * <p>The type of the product instance.</p>
         * <p>The value is fixed as RosStack, which indicates an ROS stack.</p>
         * 
         * <strong>example:</strong>
         * <p>RosStack</p>
         */
        @NameInMap("ProvisionedProductType")
        public String provisionedProductType;

        /**
         * <p>The ID of the Resource Orchestration Service (ROS) stack.</p>
         * 
         * <strong>example:</strong>
         * <p>137e31df-3754-40b4-be2f-c793ad84****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The ID of the region to which the ROS stack belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("StackRegionId")
        public String stackRegionId;

        /**
         * <p>The state of the product instance. Valid values:</p>
         * <ul>
         * <li>Available: The product instance was available.</li>
         * <li>UnderChange: The information about the product instance was being changed.</li>
         * <li>Error: An exception occurred on the product instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The message that is returned for the status of the product instance.</p>
         * <blockquote>
         * <p>This parameter is returned only when Error is returned for the Status parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Resource CREATE failed: terraform stack sc-146611588617****-pp-bp1ddg1n2a**** failure...</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        public static ListProvisionedProductsResponseBodyProvisionedProductDetails build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductsResponseBodyProvisionedProductDetails self = new ListProvisionedProductsResponseBodyProvisionedProductDetails();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setLastProvisioningTaskId(String lastProvisioningTaskId) {
            this.lastProvisioningTaskId = lastProvisioningTaskId;
            return this;
        }
        public String getLastProvisioningTaskId() {
            return this.lastProvisioningTaskId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setLastSuccessfulProvisioningTaskId(String lastSuccessfulProvisioningTaskId) {
            this.lastSuccessfulProvisioningTaskId = lastSuccessfulProvisioningTaskId;
            return this;
        }
        public String getLastSuccessfulProvisioningTaskId() {
            return this.lastSuccessfulProvisioningTaskId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setLastTaskId(String lastTaskId) {
            this.lastTaskId = lastTaskId;
            return this;
        }
        public String getLastTaskId() {
            return this.lastTaskId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setOwnerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }
        public String getOwnerPrincipalId() {
            return this.ownerPrincipalId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setOwnerPrincipalType(String ownerPrincipalType) {
            this.ownerPrincipalType = ownerPrincipalType;
            return this;
        }
        public String getOwnerPrincipalType() {
            return this.ownerPrincipalType;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProvisionedProductArn(String provisionedProductArn) {
            this.provisionedProductArn = provisionedProductArn;
            return this;
        }
        public String getProvisionedProductArn() {
            return this.provisionedProductArn;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProvisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProvisionedProductName(String provisionedProductName) {
            this.provisionedProductName = provisionedProductName;
            return this;
        }
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setProvisionedProductType(String provisionedProductType) {
            this.provisionedProductType = provisionedProductType;
            return this;
        }
        public String getProvisionedProductType() {
            return this.provisionedProductType;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setStackRegionId(String stackRegionId) {
            this.stackRegionId = stackRegionId;
            return this;
        }
        public String getStackRegionId() {
            return this.stackRegionId;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProvisionedProductsResponseBodyProvisionedProductDetails setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

}
