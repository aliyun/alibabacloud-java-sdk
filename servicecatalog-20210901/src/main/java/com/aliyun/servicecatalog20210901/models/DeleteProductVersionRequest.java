// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteProductVersionRequest extends TeaModel {
    // 产品版本ID
    @NameInMap("ProductVersionId")
    public String productVersionId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductVersionRequest self = new DeleteProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductVersionRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public DeleteProductVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
