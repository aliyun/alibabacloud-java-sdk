// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    /**
     * <p>产品描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>代表资源名称的资源属性字段</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>产品提供方</p>
     */
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
