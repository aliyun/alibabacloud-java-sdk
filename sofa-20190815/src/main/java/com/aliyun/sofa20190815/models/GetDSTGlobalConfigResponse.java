// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDSTGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDSTGlobalConfigResponseBody body;

    public static GetDSTGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDSTGlobalConfigResponse self = new GetDSTGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDSTGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDSTGlobalConfigResponse setBody(GetDSTGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDSTGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
