// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsAdminResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 产品列表
    @NameInMap("ProductDetails")
    public java.util.List<ListProductsAsAdminResponseBodyProductDetails> productDetails;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProductsAsAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsAsAdminResponseBody self = new ListProductsAsAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsAsAdminResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductsAsAdminResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductsAsAdminResponseBody setProductDetails(java.util.List<ListProductsAsAdminResponseBodyProductDetails> productDetails) {
        this.productDetails = productDetails;
        return this;
    }
    public java.util.List<ListProductsAsAdminResponseBodyProductDetails> getProductDetails() {
        return this.productDetails;
    }

    public ListProductsAsAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsAsAdminResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductsAsAdminResponseBodyProductDetails extends TeaModel {
        // 产品创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 产品描述
        @NameInMap("Description")
        public String description;

        // 产品ARN
        @NameInMap("ProductArn")
        public String productArn;

        // 产品ID
        @NameInMap("ProductId")
        public String productId;

        // 产品名字
        @NameInMap("ProductName")
        public String productName;

        // 产品类型
        @NameInMap("ProductType")
        public String productType;

        // 产品提供方
        @NameInMap("ProviderName")
        public String providerName;

        public static ListProductsAsAdminResponseBodyProductDetails build(java.util.Map<String, ?> map) throws Exception {
            ListProductsAsAdminResponseBodyProductDetails self = new ListProductsAsAdminResponseBodyProductDetails();
            return TeaModel.build(map, self);
        }

        public ListProductsAsAdminResponseBodyProductDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProductsAsAdminResponseBodyProductDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsAsAdminResponseBodyProductDetails setProductArn(String productArn) {
            this.productArn = productArn;
            return this;
        }
        public String getProductArn() {
            return this.productArn;
        }

        public ListProductsAsAdminResponseBodyProductDetails setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductsAsAdminResponseBodyProductDetails setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsAsAdminResponseBodyProductDetails setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListProductsAsAdminResponseBodyProductDetails setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
