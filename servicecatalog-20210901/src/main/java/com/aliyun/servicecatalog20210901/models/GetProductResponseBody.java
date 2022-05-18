// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductResponseBody extends TeaModel {
    @NameInMap("ProductDetail")
    public GetProductResponseBodyProductDetail productDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductResponseBody self = new GetProductResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductResponseBody setProductDetail(GetProductResponseBodyProductDetail productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public GetProductResponseBodyProductDetail getProductDetail() {
        return this.productDetail;
    }

    public GetProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductResponseBodyProductDetail extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProductArn")
        public String productArn;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("ProviderName")
        public String providerName;

        public static GetProductResponseBodyProductDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProductResponseBodyProductDetail self = new GetProductResponseBodyProductDetail();
            return TeaModel.build(map, self);
        }

        public GetProductResponseBodyProductDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProductResponseBodyProductDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductResponseBodyProductDetail setProductArn(String productArn) {
            this.productArn = productArn;
            return this;
        }
        public String getProductArn() {
            return this.productArn;
        }

        public GetProductResponseBodyProductDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProductResponseBodyProductDetail setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductResponseBodyProductDetail setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetProductResponseBodyProductDetail setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
