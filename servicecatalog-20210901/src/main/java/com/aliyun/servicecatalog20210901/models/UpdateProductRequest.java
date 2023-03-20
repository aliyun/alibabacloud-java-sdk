// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    /**
     * <p>The description of the product.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the product.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The name of the product.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The provider of the product.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
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
