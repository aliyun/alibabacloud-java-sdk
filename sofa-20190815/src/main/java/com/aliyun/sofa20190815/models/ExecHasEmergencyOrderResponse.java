// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasEmergencyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasEmergencyOrderResponseBody body;

    public static ExecHasEmergencyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasEmergencyOrderResponse self = new ExecHasEmergencyOrderResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasEmergencyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasEmergencyOrderResponse setBody(ExecHasEmergencyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasEmergencyOrderResponseBody getBody() {
        return this.body;
    }

}
