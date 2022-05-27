// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    // 产品描述
    @NameInMap("Description")
    public String description;

    // 产品ID
    @NameInMap("ProductId")
    public String productId;

    // 产品名称
    @NameInMap("ProductName")
    public String productName;

    // 提供者名称
    @NameInMap("ProviderName")
    public String providerName;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public UpdateProductRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

}
