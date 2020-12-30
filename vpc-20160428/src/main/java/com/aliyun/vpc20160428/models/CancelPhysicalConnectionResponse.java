// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelPhysicalConnectionResponseBody body;

    public static CancelPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPhysicalConnectionResponse self = new CancelPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CancelPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPhysicalConnectionResponse setBody(CancelPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
