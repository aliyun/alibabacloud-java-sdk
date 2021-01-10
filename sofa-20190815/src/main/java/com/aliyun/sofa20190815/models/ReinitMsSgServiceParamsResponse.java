// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitMsSgServiceParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReinitMsSgServiceParamsResponseBody body;

    public static ReinitMsSgServiceParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitMsSgServiceParamsResponse self = new ReinitMsSgServiceParamsResponse();
        return TeaModel.build(map, self);
    }

    public ReinitMsSgServiceParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinitMsSgServiceParamsResponse setBody(ReinitMsSgServiceParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinitMsSgServiceParamsResponseBody getBody() {
        return this.body;
    }

}
