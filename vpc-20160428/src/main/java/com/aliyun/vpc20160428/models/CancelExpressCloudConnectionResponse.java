// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelExpressCloudConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelExpressCloudConnectionResponseBody body;

    public static CancelExpressCloudConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelExpressCloudConnectionResponse self = new CancelExpressCloudConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CancelExpressCloudConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelExpressCloudConnectionResponse setBody(CancelExpressCloudConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelExpressCloudConnectionResponseBody getBody() {
        return this.body;
    }

}
