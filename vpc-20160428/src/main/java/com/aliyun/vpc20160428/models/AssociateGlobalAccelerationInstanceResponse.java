// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateGlobalAccelerationInstanceResponseBody body;

    public static AssociateGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateGlobalAccelerationInstanceResponse self = new AssociateGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AssociateGlobalAccelerationInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateGlobalAccelerationInstanceResponse setBody(AssociateGlobalAccelerationInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateGlobalAccelerationInstanceResponseBody getBody() {
        return this.body;
    }

}
