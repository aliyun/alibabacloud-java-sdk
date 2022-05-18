// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductRequest extends TeaModel {
    @NameInMap("ProductId")
    public String productId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetProductRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductRequest self = new GetProductRequest();
        return TeaModel.build(map, self);
    }

    public GetProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
