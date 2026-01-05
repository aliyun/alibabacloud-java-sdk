// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsEndUserResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The products.</p>
     */
    @NameInMap("ProductSummaries")
    public java.util.List<ListProductsAsEndUserResponseBodyProductSummaries> productSummaries;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The time when the product was created.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-12T06:10:37Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the product.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the default launch option exists. Valid values:</p>
         * <ul>
         * <li>true: The default launch option exists. In this case, the PortfolioId parameter is not required when the product is launched or when the information about the product instance is updated.</li>
         * <li>false: The default launch option does not exist. In this case, the PortfolioId parameter is required when the product is launched or when the information about the product instance is updated. For more information about the PortfolioId parameter, see <a href="~~ListLaunchOptions~~">ListLaunchOptions</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If the product is added to only one product portfolio, the default launch option exists. If the product is added to multiple product portfolios, multiple launch options exist at the same time. However, no default launch options exist.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDefaultLaunchOption")
        public Boolean hasDefaultLaunchOption;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:servicecatalog:cn-hangzhou:146611588617****:product/prod-bp18r7q127****</p>
         */
        @NameInMap("ProductArn")
        public String productArn;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The name of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO-Create an ECS instance</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The type of the product.</p>
         * <p>The value is set to Ros, which indicates Resource Orchestration Service (ROS).</p>
         * 
         * <strong>example:</strong>
         * <p>Ros</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The provider of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>IT team</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <p>The type of the product template. Valid values:</p>
         * <ul>
         * <li>RosTerraformTemplate: the Terraform template that is supported by ROS.</li>
         * <li>RosStandardTemplate: the standard ROS template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RosTerraformTemplate</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

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

        public ListProductsAsEndUserResponseBodyProductSummaries setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
