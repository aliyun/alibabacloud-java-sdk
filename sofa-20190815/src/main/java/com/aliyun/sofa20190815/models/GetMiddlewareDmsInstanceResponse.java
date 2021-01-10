// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMiddlewareDmsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMiddlewareDmsInstanceResponseBody body;

    public static GetMiddlewareDmsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareDmsInstanceResponse self = new GetMiddlewareDmsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareDmsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMiddlewareDmsInstanceResponse setBody(GetMiddlewareDmsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMiddlewareDmsInstanceResponseBody getBody() {
        return this.body;
    }

}
