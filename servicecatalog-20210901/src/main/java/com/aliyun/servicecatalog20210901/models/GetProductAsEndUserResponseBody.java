// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductAsEndUserResponseBody extends TeaModel {
    // 产品详情
    @NameInMap("ProductSummary")
    public GetProductAsEndUserResponseBodyProductSummary productSummary;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetProductAsEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductAsEndUserResponseBody self = new GetProductAsEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductAsEndUserResponseBody setProductSummary(GetProductAsEndUserResponseBodyProductSummary productSummary) {
        this.productSummary = productSummary;
        return this;
    }
    public GetProductAsEndUserResponseBodyProductSummary getProductSummary() {
        return this.productSummary;
    }

    public GetProductAsEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductAsEndUserResponseBodyProductSummary extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 产品描述
        @NameInMap("Description")
        public String description;

        @NameInMap("HasDefaultLaunchOption")
        public Boolean hasDefaultLaunchOption;

        // 产品ARN
        @NameInMap("ProductArn")
        public String productArn;

        // 产品ID
        @NameInMap("ProductId")
        public String productId;

        // 产品名称
        @NameInMap("ProductName")
        public String productName;

        // 产品类型
        @NameInMap("ProductType")
        public String productType;

        // 提供者名称
        @NameInMap("ProviderName")
        public String providerName;

        public static GetProductAsEndUserResponseBodyProductSummary build(java.util.Map<String, ?> map) throws Exception {
            GetProductAsEndUserResponseBodyProductSummary self = new GetProductAsEndUserResponseBodyProductSummary();
            return TeaModel.build(map, self);
        }

        public GetProductAsEndUserResponseBodyProductSummary setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProductAsEndUserResponseBodyProductSummary setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductAsEndUserResponseBodyProductSummary setHasDefaultLaunchOption(Boolean hasDefaultLaunchOption) {
            this.hasDefaultLaunchOption = hasDefaultLaunchOption;
            return this;
        }
        public Boolean getHasDefaultLaunchOption() {
            return this.hasDefaultLaunchOption;
        }

        public GetProductAsEndUserResponseBodyProductSummary setProductArn(String productArn) {
            this.productArn = productArn;
            return this;
        }
        public String getProductArn() {
            return this.productArn;
        }

        public GetProductAsEndUserResponseBodyProductSummary setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProductAsEndUserResponseBodyProductSummary setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductAsEndUserResponseBodyProductSummary setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetProductAsEndUserResponseBodyProductSummary setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
