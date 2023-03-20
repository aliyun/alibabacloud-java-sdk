// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class TerminateProvisionedProductRequest extends TeaModel {
    /**
     * <p>The ID of the product instance.</p>
     */
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    public static TerminateProvisionedProductRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateProvisionedProductRequest self = new TerminateProvisionedProductRequest();
        return TeaModel.build(map, self);
    }

    public TerminateProvisionedProductRequest setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

}
