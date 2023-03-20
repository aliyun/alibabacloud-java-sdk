// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class TerminateProvisionedProductResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TerminateProvisionedProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateProvisionedProductResponseBody self = new TerminateProvisionedProductResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateProvisionedProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
