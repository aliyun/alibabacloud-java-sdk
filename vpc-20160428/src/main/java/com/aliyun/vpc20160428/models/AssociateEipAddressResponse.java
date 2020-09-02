// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssociateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressResponse self = new AssociateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
