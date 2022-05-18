// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class TerminateProvisionedProductRequest extends TeaModel {
    // 实例ID
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    @NameInMap("RegionId")
    public String regionId;

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

    public TerminateProvisionedProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
