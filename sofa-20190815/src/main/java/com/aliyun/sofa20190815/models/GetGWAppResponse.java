// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetGWAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGWAppResponseBody body;

    public static GetGWAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGWAppResponse self = new GetGWAppResponse();
        return TeaModel.build(map, self);
    }

    public GetGWAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGWAppResponse setBody(GetGWAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGWAppResponseBody getBody() {
        return this.body;
    }

}
