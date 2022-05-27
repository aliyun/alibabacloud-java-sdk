// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 实例列表
    @NameInMap("ProvisionedProductDetails")
    public java.util.List<ListProvisionedProductsResponseBodyProvisionedProductDetails> provisionedProductDetails;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
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
