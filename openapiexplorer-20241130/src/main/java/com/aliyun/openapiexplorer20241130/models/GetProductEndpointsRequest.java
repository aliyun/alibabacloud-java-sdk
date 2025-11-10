// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetProductEndpointsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("product")
    public String product;

    public static GetProductEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductEndpointsRequest self = new GetProductEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public GetProductEndpointsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
