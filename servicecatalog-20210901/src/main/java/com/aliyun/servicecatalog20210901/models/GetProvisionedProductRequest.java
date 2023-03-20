// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProvisionedProductRequest extends TeaModel {
    /**
     * <p>The ID of the product instance.</p>
     */
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    public static GetProvisionedProductRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionedProductRequest self = new GetProvisionedProductRequest();
        return TeaModel.build(map, self);
    }

    public GetProvisionedProductRequest setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

}
