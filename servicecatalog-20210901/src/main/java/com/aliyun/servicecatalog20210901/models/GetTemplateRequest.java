// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-bp18r7q127****</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The ID of the product version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pv-bp15e79d26****</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetTemplateRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

}
