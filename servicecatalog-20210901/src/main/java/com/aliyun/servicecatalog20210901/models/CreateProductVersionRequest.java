// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductVersionRequest extends TeaModel {
    // 是否启用
    @NameInMap("Active")
    public Boolean active;

    // 产品版本描述
    @NameInMap("Description")
    public String description;

    // 推荐信息
    @NameInMap("Guidance")
    public String guidance;

    // 产品版本所属的产品ID
    @NameInMap("ProductId")
    public String productId;

    // 产品版本名称
    @NameInMap("ProductVersionName")
    public String productVersionName;

    @NameInMap("RegionId")
    public String regionId;

    // 模板类型
    @NameInMap("TemplateType")
    public String templateType;

    // 模板的OSS地址
    @NameInMap("TemplateUrl")
    public String templateUrl;

    public static CreateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionRequest self = new CreateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public CreateProductVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductVersionRequest setGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }
    public String getGuidance() {
        return this.guidance;
    }

    public CreateProductVersionRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateProductVersionRequest setProductVersionName(String productVersionName) {
        this.productVersionName = productVersionName;
        return this;
    }
    public String getProductVersionName() {
        return this.productVersionName;
    }

    public CreateProductVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateProductVersionRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateProductVersionRequest setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }
    public String getTemplateUrl() {
        return this.templateUrl;
    }

}
