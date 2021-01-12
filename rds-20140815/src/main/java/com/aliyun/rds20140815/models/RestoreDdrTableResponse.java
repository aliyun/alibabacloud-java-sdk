// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreDdrTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreDdrTableResponseBody body;

    public static RestoreDdrTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreDdrTableResponse self = new RestoreDdrTableResponse();
        return TeaModel.build(map, self);
    }

    public RestoreDdrTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreDdrTableResponse setBody(RestoreDdrTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreDdrTableResponseBody getBody() {
        return this.body;
    }

}
