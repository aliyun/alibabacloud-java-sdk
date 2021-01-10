// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopTSActivityInstanceResponseBody body;

    public static StopTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTSActivityInstanceResponse self = new StopTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTSActivityInstanceResponse setBody(StopTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
