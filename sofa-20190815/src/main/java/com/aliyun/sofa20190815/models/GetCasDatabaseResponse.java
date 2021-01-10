// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCasDatabaseResponseBody body;

    public static GetCasDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCasDatabaseResponse self = new GetCasDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetCasDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCasDatabaseResponse setBody(GetCasDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCasDatabaseResponseBody getBody() {
        return this.body;
    }

}
