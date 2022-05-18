// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductResponseBody extends TeaModel {
    // 实例ID
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProvisionedProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProvisionedProductResponseBody self = new UpdateProvisionedProductResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProvisionedProductResponseBody setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public UpdateProvisionedProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
