// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgServiceParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMsSgServiceParamsResponseBody body;

    public static DisableMsSgServiceParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgServiceParamsResponse self = new DisableMsSgServiceParamsResponse();
        return TeaModel.build(map, self);
    }

    public DisableMsSgServiceParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMsSgServiceParamsResponse setBody(DisableMsSgServiceParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMsSgServiceParamsResponseBody getBody() {
        return this.body;
    }

}
