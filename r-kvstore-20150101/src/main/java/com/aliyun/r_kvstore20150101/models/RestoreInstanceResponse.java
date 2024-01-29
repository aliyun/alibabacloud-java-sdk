// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestoreInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RestoreInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreInstanceResponse setBody(RestoreInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreInstanceResponseBody getBody() {
        return this.body;
    }

}
