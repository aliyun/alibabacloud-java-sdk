// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableDWSTaskSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDWSTaskSubscribeResponseBody body;

    public static DisableDWSTaskSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDWSTaskSubscribeResponse self = new DisableDWSTaskSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public DisableDWSTaskSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDWSTaskSubscribeResponse setBody(DisableDWSTaskSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDWSTaskSubscribeResponseBody getBody() {
        return this.body;
    }

}
