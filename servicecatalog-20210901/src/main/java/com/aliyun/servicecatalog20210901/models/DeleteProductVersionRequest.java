// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteProductVersionRequest extends TeaModel {
    /**
     * <p>The ID of the product version.</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

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

}
