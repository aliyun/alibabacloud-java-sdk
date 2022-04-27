// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetListenerAttributeResponseBody body;

    public static GetListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeResponse self = new GetListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListenerAttributeResponse setBody(GetListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
