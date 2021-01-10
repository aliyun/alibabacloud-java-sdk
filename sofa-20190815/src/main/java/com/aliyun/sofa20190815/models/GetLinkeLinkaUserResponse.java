// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinkaUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinkaUserResponseBody body;

    public static GetLinkeLinkaUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinkaUserResponse self = new GetLinkeLinkaUserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinkaUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinkaUserResponse setBody(GetLinkeLinkaUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinkaUserResponseBody getBody() {
        return this.body;
    }

}
