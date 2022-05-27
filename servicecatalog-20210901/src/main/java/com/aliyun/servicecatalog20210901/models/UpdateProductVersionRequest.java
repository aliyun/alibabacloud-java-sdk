// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRequest extends TeaModel {
    // 是否启用
    @NameInMap("Active")
    public Boolean active;

    // 产品版本描述
    @NameInMap("Description")
    public String description;

    // 推荐信息
    @NameInMap("Guidance")
    public String guidance;

    // 产品版本ID
    @NameInMap("ProductVersionId")
    public String productVersionId;

    // 产品版本名称
    @NameInMap("ProductVersionName")
    public String productVersionName;

    public static UpdateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionRequest self = new UpdateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public UpdateProductVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductVersionRequest setGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }
    public String getGuidance() {
        return this.guidance;
    }

    public UpdateProductVersionRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public UpdateProductVersionRequest setProductVersionName(String productVersionName) {
        this.productVersionName = productVersionName;
        return this;
    }
    public String getProductVersionName() {
        return this.productVersionName;
    }

}
