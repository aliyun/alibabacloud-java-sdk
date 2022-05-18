// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductVersionResponseBody extends TeaModel {
    // 产品版本ID
    @NameInMap("ProductVersionId")
    public String productVersionId;

    // 请求ID
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
