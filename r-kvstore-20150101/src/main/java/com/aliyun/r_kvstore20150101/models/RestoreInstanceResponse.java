// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestoreInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreInstanceResponseBody body;

    public static RestoreInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreInstanceResponse self = new RestoreInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestoreInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreInstanceResponse setBody(RestoreInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreInstanceResponseBody getBody() {
        return this.body;
    }

}
