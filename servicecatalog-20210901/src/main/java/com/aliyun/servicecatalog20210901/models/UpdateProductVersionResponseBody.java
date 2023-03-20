// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the product version.</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionResponseBody self = new UpdateProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionResponseBody setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public UpdateProductVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
