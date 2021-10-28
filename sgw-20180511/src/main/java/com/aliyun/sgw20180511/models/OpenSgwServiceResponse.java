// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class OpenSgwServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenSgwServiceResponseBody body;

    public static OpenSgwServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenSgwServiceResponse self = new OpenSgwServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenSgwServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenSgwServiceResponse setBody(OpenSgwServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenSgwServiceResponseBody getBody() {
        return this.body;
    }

}
