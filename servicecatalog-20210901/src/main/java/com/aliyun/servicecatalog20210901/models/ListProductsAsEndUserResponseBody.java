// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsEndUserResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 产品列表
    @NameInMap("ProductSummaries")
    public java.util.List<ListProductsAsEndUserResponseBodyProductSummaries> productSummaries;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProductsAsEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsAsEndUserResponseBody self = new ListProductsAsEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsAsEndUserResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductsAsEndUserResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductsAsEndUserResponseBody setProductSummaries(java.util.List<ListProductsAsEndUserResponseBodyProductSummaries> productSummaries) {
        this.productSummaries = productSummaries;
        return this;
    }
    public java.util.List<ListProductsAsEndUserResponseBodyProductSummaries> getProductSummaries() {
        return this.productSummaries;
    }

    public ListProductsAsEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsAsEndUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductsAsEndUserResponseBodyProductSummaries extends TeaModel {
        // 产品创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 产品描述
        @NameInMap("Description")
        public String description;

        // 是否存在默认的启动选项
        @NameInMap("HasDefaultLaunchOption")
        public Boolean hasDefaultLaunchOption;

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

        public static ListProductsAsEndUserResponseBodyProductSummaries build(java.util.Map<String, ?> map) throws Exception {
            ListProductsAsEndUserResponseBodyProductSummaries self = new ListProductsAsEndUserResponseBodyProductSummaries();
            return TeaModel.build(map, self);
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setHasDefaultLaunchOption(Boolean hasDefaultLaunchOption) {
            this.hasDefaultLaunchOption = hasDefaultLaunchOption;
            return this;
        }
        public Boolean getHasDefaultLaunchOption() {
            return this.hasDefaultLaunchOption;
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setProductArn(String productArn) {
            this.productArn = productArn;
            return this;
        }
        public String getProductArn() {
            return this.productArn;
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListProductsAsEndUserResponseBodyProductSummaries setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
