// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductAsEndUserResponseBody extends TeaModel {
    /**
     * <p>The information about the product.</p>
     */
    @NameInMap("ProductSummary")
    public GetProductAsEndUserResponseBodyProductSummary productSummary;

    /**
     * <p>The ID of the request.</p>
     */
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
         * <p>Indicates whether the default launch option exists. Valid values:</p>
         * <br>
         * <p>*   true: The default launch option exists. In this case, the PortfolioId parameter is not required when the product is launched or when the information about the product instance is updated.</p>
         * <p>*   false: The default launch option does not exist. In this case, the PortfolioId parameter is required when the product is launched or when the information about the product instance is updated. For more information about how to obtain the value of the PortfolioId parameter, see [ListLaunchOptions](~~ListLaunchOptions~~).</p>
         * <br>
         * <p>> If the product is added to only one product portfolio, the default launch option exists. If the product is added to multiple product portfolios, multiple launch options exist at the same time. However, no default launch options exist.</p>
         */
        @NameInMap("HasDefaultLaunchOption")
        public Boolean hasDefaultLaunchOption;

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
