// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class AssociateEipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssociateEipResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipResponse self = new AssociateEipResponse();
        return TeaModel.build(map, self);
    }

    public AssociateEipResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
