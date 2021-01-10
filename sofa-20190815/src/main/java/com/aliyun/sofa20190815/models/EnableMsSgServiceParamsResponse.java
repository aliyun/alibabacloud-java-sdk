// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgServiceParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMsSgServiceParamsResponseBody body;

    public static EnableMsSgServiceParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgServiceParamsResponse self = new EnableMsSgServiceParamsResponse();
        return TeaModel.build(map, self);
    }

    public EnableMsSgServiceParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMsSgServiceParamsResponse setBody(EnableMsSgServiceParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMsSgServiceParamsResponseBody getBody() {
        return this.body;
    }

}
