// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductVersionsRequest extends TeaModel {
    /**
     * <p>The ID of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-bp18r7q127****</p>
     */
    @NameInMap("ProductId")
    public String productId;

    public static ListProductVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsRequest self = new ListProductVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
