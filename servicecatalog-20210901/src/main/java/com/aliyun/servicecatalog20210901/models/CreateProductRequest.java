// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    // 产品描述
    @NameInMap("Description")
    public String description;

    // 产品名称
    @NameInMap("ProductName")
    public String productName;

    // 产品类型
    @NameInMap("ProductType")
    public String productType;

    // 产品版本相关的参数
    @NameInMap("ProductVersionParameters")
    public CreateProductRequestProductVersionParameters productVersionParameters;

    // 提供者名称
    @NameInMap("ProviderName")
    public String providerName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateProductRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateProductRequest setProductVersionParameters(CreateProductRequestProductVersionParameters productVersionParameters) {
        this.productVersionParameters = productVersionParameters;
        return this;
    }
    public CreateProductRequestProductVersionParameters getProductVersionParameters() {
        return this.productVersionParameters;
    }

    public CreateProductRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public CreateProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateProductRequestProductVersionParameters extends TeaModel {
        // 是否启用
        @NameInMap("Active")
        public Boolean active;

        // 产品版本描述
        @NameInMap("Description")
        public String description;

        // 推荐信息
        @NameInMap("Guidance")
        public String guidance;

        // 产品版本名称
        @NameInMap("ProductVersionName")
        public String productVersionName;

        // 模板类型
        @NameInMap("TemplateType")
        public String templateType;

        // 模板的URL地址
        @NameInMap("TemplateUrl")
        public String templateUrl;

        public static CreateProductRequestProductVersionParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateProductRequestProductVersionParameters self = new CreateProductRequestProductVersionParameters();
            return TeaModel.build(map, self);
        }

        public CreateProductRequestProductVersionParameters setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateProductRequestProductVersionParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProductRequestProductVersionParameters setGuidance(String guidance) {
            this.guidance = guidance;
            return this;
        }
        public String getGuidance() {
            return this.guidance;
        }

        public CreateProductRequestProductVersionParameters setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public CreateProductRequestProductVersionParameters setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public CreateProductRequestProductVersionParameters setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

    }

}
