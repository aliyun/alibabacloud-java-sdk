// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductAsEndUserRequest extends TeaModel {
    /**
     * <p>The ID of the product.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    public static GetProductAsEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductAsEndUserRequest self = new GetProductAsEndUserRequest();
        return TeaModel.build(map, self);
    }

    public GetProductAsEndUserRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
