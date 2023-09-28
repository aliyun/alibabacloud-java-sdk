// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListLaunchOptionsRequest extends TeaModel {
    /**
     * <p>The ID of the product.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    public static ListLaunchOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLaunchOptionsRequest self = new ListLaunchOptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListLaunchOptionsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
