// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestartSupabaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartSupabaseInstanceResponseBody body;

    public static RestartSupabaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartSupabaseInstanceResponse self = new RestartSupabaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartSupabaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartSupabaseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartSupabaseInstanceResponse setBody(RestartSupabaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartSupabaseInstanceResponseBody getBody() {
        return this.body;
    }

}
