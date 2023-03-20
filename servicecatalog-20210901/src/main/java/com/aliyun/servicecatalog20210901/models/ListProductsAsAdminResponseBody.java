// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsAdminResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array that consists of products.</p>
     */
    @NameInMap("ProductDetails")
    public java.util.List<ListProductsAsAdminResponseBodyProductDetails> productDetails;

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
        /**
         * <p>The time when the product was created.</p>
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
         * <p>The value is fixed as Ros, which specifies Resource Orchestration Service (ROS).</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The provider of the product.</p>
         */
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
