// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductAsAdminResponseBody extends TeaModel {
    // 产品详情
    @NameInMap("ProductDetail")
    public GetProductAsAdminResponseBodyProductDetail productDetail;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetProductAsAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductAsAdminResponseBody self = new GetProductAsAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductAsAdminResponseBody setProductDetail(GetProductAsAdminResponseBodyProductDetail productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public GetProductAsAdminResponseBodyProductDetail getProductDetail() {
        return this.productDetail;
    }

    public GetProductAsAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductAsAdminResponseBodyProductDetail extends TeaModel {
        // 创建时间
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

        // 产品名称
        @NameInMap("ProductName")
        public String productName;

        // 产品类型
        @NameInMap("ProductType")
        public String productType;

        // 提供者名称
        @NameInMap("ProviderName")
        public String providerName;

        public static GetProductAsAdminResponseBodyProductDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProductAsAdminResponseBodyProductDetail self = new GetProductAsAdminResponseBodyProductDetail();
            return TeaModel.build(map, self);
        }

        public GetProductAsAdminResponseBodyProductDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProductAsAdminResponseBodyProductDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductAsAdminResponseBodyProductDetail setProductArn(String productArn) {
            this.productArn = productArn;
            return this;
        }
        public String getProductArn() {
            return this.productArn;
        }

        public GetProductAsAdminResponseBodyProductDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProductAsAdminResponseBodyProductDetail setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductAsAdminResponseBodyProductDetail setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetProductAsAdminResponseBodyProductDetail setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
