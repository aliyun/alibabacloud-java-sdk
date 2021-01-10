// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskUserResponseBody body;

    public static GetClriskUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskUserResponse self = new GetClriskUserResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskUserResponse setBody(GetClriskUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskUserResponseBody getBody() {
        return this.body;
    }

}
