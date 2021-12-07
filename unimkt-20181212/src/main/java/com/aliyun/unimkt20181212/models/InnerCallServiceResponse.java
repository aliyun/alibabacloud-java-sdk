// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class InnerCallServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InnerCallServiceResponseBody body;

    public static InnerCallServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerCallServiceResponse self = new InnerCallServiceResponse();
        return TeaModel.build(map, self);
    }

    public InnerCallServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerCallServiceResponse setBody(InnerCallServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerCallServiceResponseBody getBody() {
        return this.body;
    }

}
