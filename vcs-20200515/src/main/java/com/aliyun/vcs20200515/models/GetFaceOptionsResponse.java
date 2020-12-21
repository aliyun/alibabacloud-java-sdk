// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceOptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFaceOptionsResponseBody body;

    public static GetFaceOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceOptionsResponse self = new GetFaceOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFaceOptionsResponse setBody(GetFaceOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFaceOptionsResponseBody getBody() {
        return this.body;
    }

}
