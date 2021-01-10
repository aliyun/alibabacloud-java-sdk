// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeactiveTSJobItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeactiveTSJobItemResponseBody body;

    public static DeactiveTSJobItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactiveTSJobItemResponse self = new DeactiveTSJobItemResponse();
        return TeaModel.build(map, self);
    }

    public DeactiveTSJobItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactiveTSJobItemResponse setBody(DeactiveTSJobItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactiveTSJobItemResponseBody getBody() {
        return this.body;
    }

}
