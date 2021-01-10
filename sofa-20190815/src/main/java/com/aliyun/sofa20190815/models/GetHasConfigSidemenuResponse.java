// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasConfigSidemenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasConfigSidemenuResponseBody body;

    public static GetHasConfigSidemenuResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasConfigSidemenuResponse self = new GetHasConfigSidemenuResponse();
        return TeaModel.build(map, self);
    }

    public GetHasConfigSidemenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasConfigSidemenuResponse setBody(GetHasConfigSidemenuResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasConfigSidemenuResponseBody getBody() {
        return this.body;
    }

}
