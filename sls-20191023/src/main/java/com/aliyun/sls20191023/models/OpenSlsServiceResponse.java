// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class OpenSlsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenSlsServiceResponseBody body;

    public static OpenSlsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenSlsServiceResponse self = new OpenSlsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenSlsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenSlsServiceResponse setBody(OpenSlsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenSlsServiceResponseBody getBody() {
        return this.body;
    }

}
