// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToCenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GrantInstanceToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCenResponse self = new GrantInstanceToCenResponse();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToCenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
