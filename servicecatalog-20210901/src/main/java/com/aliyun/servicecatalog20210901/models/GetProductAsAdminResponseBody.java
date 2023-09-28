// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductAsAdminResponseBody extends TeaModel {
    /**
     * <p>The information about the product.</p>
     */
    @NameInMap("ProductDetail")
    public GetProductAsAdminResponseBodyProductDetail productDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag options associated with the product.</p>
     */
    @NameInMap("TagOptions")
    public java.util.List<GetProductAsAdminResponseBodyTagOptions> tagOptions;

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

    public GetProductAsAdminResponseBody setTagOptions(java.util.List<GetProductAsAdminResponseBodyTagOptions> tagOptions) {
        this.tagOptions = tagOptions;
        return this;
    }
    public java.util.List<GetProductAsAdminResponseBodyTagOptions> getTagOptions() {
        return this.tagOptions;
    }

    public static class GetProductAsAdminResponseBodyProductDetail extends TeaModel {
        /**
         * <p>The creation time.</p>
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
         * <p>The value is fixed as Ros, which indicates Resource Orchestration Service (ROS).</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The provider of the product.</p>
         */
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

    public static class GetProductAsAdminResponseBodyTagOptions extends TeaModel {
        /**
         * <p>Indicates whether the tag option is enabled. Valid values:</p>
         * <br>
         * <p>- true (default)</p>
         * <p>- false</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The key of the tag option.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the owner of the tag option.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the tag option.</p>
         */
        @NameInMap("TagOptionId")
        public String tagOptionId;

        /**
         * <p>The value of the tag option.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetProductAsAdminResponseBodyTagOptions build(java.util.Map<String, ?> map) throws Exception {
            GetProductAsAdminResponseBodyTagOptions self = new GetProductAsAdminResponseBodyTagOptions();
            return TeaModel.build(map, self);
        }

        public GetProductAsAdminResponseBodyTagOptions setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetProductAsAdminResponseBodyTagOptions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetProductAsAdminResponseBodyTagOptions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetProductAsAdminResponseBodyTagOptions setTagOptionId(String tagOptionId) {
            this.tagOptionId = tagOptionId;
            return this;
        }
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        public GetProductAsAdminResponseBodyTagOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
