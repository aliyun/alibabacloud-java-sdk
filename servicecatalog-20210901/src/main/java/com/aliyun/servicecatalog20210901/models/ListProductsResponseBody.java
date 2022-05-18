// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("ProductSummaries")
    public java.util.List<ListProductsResponseBodyProductSummaries> productSummaries;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setProductSummaries(java.util.List<ListProductsResponseBodyProductSummaries> productSummaries) {
        this.productSummaries = productSummaries;
        return this;
    }
    public java.util.List<ListProductsResponseBodyProductSummaries> getProductSummaries() {
        return this.productSummaries;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductsResponseBodyProductSummaries extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("HasDefaultLaunchOption")
        public Boolean hasDefaultLaunchOption;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("ProviderName")
        public String providerName;

        public static ListProductsResponseBodyProductSummaries build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProductSummaries self = new ListProductsResponseBodyProductSummaries();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProductSummaries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProductsResponseBodyProductSummaries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyProductSummaries setHasDefaultLaunchOption(Boolean hasDefaultLaunchOption) {
            this.hasDefaultLaunchOption = hasDefaultLaunchOption;
            return this;
        }
        public Boolean getHasDefaultLaunchOption() {
            return this.hasDefaultLaunchOption;
        }

        public ListProductsResponseBodyProductSummaries setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductsResponseBodyProductSummaries setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsResponseBodyProductSummaries setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListProductsResponseBodyProductSummaries setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
