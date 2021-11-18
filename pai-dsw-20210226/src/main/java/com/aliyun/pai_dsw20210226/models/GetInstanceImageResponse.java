// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceImageResponseBody body;

    public static GetInstanceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceImageResponse self = new GetInstanceImageResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceImageResponse setBody(GetInstanceImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceImageResponseBody getBody() {
        return this.body;
    }

}
