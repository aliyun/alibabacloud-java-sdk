// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassociateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressResponse self = new UnassociateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
