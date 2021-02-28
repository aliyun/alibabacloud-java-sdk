// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class OpenScdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenScdnServiceResponseBody body;

    public static OpenScdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenScdnServiceResponse self = new OpenScdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenScdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenScdnServiceResponse setBody(OpenScdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenScdnServiceResponseBody getBody() {
        return this.body;
    }

}
