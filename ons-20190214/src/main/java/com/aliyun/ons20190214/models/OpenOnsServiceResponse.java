// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OpenOnsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenOnsServiceResponseBody body;

    public static OpenOnsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenOnsServiceResponse self = new OpenOnsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenOnsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenOnsServiceResponse setBody(OpenOnsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenOnsServiceResponseBody getBody() {
        return this.body;
    }

}
