// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserConfigResponseBody body;

    public static GetUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigResponse self = new GetUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserConfigResponse setBody(GetUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserConfigResponseBody getBody() {
        return this.body;
    }

}
