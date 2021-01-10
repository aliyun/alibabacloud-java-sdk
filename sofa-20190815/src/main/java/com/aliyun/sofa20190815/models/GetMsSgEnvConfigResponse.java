// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgEnvConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsSgEnvConfigResponseBody body;

    public static GetMsSgEnvConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgEnvConfigResponse self = new GetMsSgEnvConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMsSgEnvConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsSgEnvConfigResponse setBody(GetMsSgEnvConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsSgEnvConfigResponseBody getBody() {
        return this.body;
    }

}
